package com.baosight.bwhs.ma.my.controller;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.BaseRequest;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.common.utils.TokenUtil;
import com.baosight.bwhs.framework.core.BaseController;
import com.baosight.bwhs.framework.core.page.Page;
import com.baosight.bwhs.ma.amusing.entity.EmpThankcard;
import com.baosight.bwhs.ma.amusing.entity.ThankcardOrg;
import com.baosight.bwhs.ma.amusing.request.SendThankCardReq;
import com.baosight.bwhs.ma.amusing.response.SendThankCardRecordResp;
import com.baosight.bwhs.ma.amusing.service.IEmpThankcardService;
import com.baosight.bwhs.ma.amusing.service.IThankcardOrgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 人员感谢卡 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2021-04-12
 */
@Api(value = "工作-感谢卡", tags = "感谢卡")
@RestController
@RequestMapping(SYSConstants.MOBILE_API_NAME+"/my/myThankcard")
public class MyThankcardController extends BaseController {
    @Autowired
    IEmpThankcardService iEmpThankcardService;
    @Autowired
    IThankcardOrgService iThankcardOrgService;
    /**
     * 我的感谢卡
     *
     * @param
     * @return
     */
    @ApiOperation("我的感谢卡")
    @PostMapping(value = "/myThankCard")
    @ResponseBody
    public JsonResult<Page<ThankcardOrg>> myThankCard(BaseRequest baseRequest) {
        //使用构造函数，里面有翻页初始化
        String empCode=TokenUtil.getTokenUserName();
        Page<ThankcardOrg> pageOrg =new Page<>(baseRequest);
        QueryWrapper<ThankcardOrg> queryWrapper = new QueryWrapper<>();
        queryWrapper.exists(" select 1 from MA.T_MA_EMP_THANKCARD d " +
                "where d.THANKCARD_LIB_GUID=MA.T_MA_THANKCARD_ORG.THANKCARD_LIB_GUID and d.DELETE_FLAG='0'  " +
                " and SENDER_TYPE='E'" +
                "and d.RECEIVE_OBJECT_CODE='"+empCode+"'");
        //翻页对象
        pageOrg = iThankcardOrgService.page(pageOrg, queryWrapper);

        return new JsonResult(pageOrg);
    }

    /**
     * 赠送感谢卡
     *
     * @param
     * @return
     */
    @ApiOperation("赠送感谢卡")
    @PostMapping(value = "/sendMyThankCard")
    @ResponseBody
    public JsonResult selectMyThankCard(SendThankCardReq sendThankCardReq) {
        EmpThankcard bean = new EmpThankcard();
        BeanUtil.copyProperties(sendThankCardReq, bean);
        iEmpThankcardService.save(bean);
        return new JsonResult(null);
    }

    /**
     * 赠送记录
     *
     * @param
     * @return
     */
    @ApiOperation("赠送记录")
    @PostMapping(value = "/sendThankCardRecord")
    @ResponseBody
    public JsonResult<Page<SendThankCardRecordResp>> mySendThankCardRecord(BaseRequest baseRequest) {
        //使用构造函数，里面有翻页初始化
        //Page<ThankcardOrg> pageOrg =new Page<>(baseRequest);

        Page<EmpThankcard> page = new Page<>(baseRequest);
        QueryWrapper<EmpThankcard> queryWrapper = new QueryWrapper<>();
        queryWrapper.clear();
        queryWrapper.eq("EMP_CODE", TokenUtil.getTokenUserName());

        //翻页对象
        page = iEmpThankcardService.page(page, queryWrapper);

        Page<SendThankCardRecordResp> sendThankCardRecordRespPage = new Page<>();
        List<EmpThankcard> list = page.getRecords();
        List<SendThankCardRecordResp> sendList = new ArrayList<>();
        SendThankCardRecordResp sendThankCardRecordResp;
        for (EmpThankcard bean : list) {
            sendThankCardRecordResp = new SendThankCardRecordResp();
            sendThankCardRecordResp.setSendMsg("我赠送给" + bean.getReceiveObjectName() + "一张" + "/'");
            sendList.add(sendThankCardRecordResp);
        }
        sendThankCardRecordRespPage.setRecords(sendList);
        sendThankCardRecordRespPage.setCurrent(sendThankCardRecordRespPage.getCurrent());
        sendThankCardRecordRespPage.setSize(sendThankCardRecordRespPage.getSize());

        return new JsonResult(sendThankCardRecordRespPage);
    }
}
