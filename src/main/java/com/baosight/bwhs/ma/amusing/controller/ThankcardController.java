package com.baosight.bwhs.ma.amusing.controller;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baosight.bwhs.common.domain.BaseRequest;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.common.utils.TokenUtil;
import com.baosight.bwhs.framework.core.BaseController;
import com.baosight.bwhs.framework.core.page.Page;
import com.baosight.bwhs.ma.amusing.entity.EmpThankcard;
import com.baosight.bwhs.ma.amusing.entity.ThankcardLib;
import com.baosight.bwhs.ma.amusing.request.SendThankCardReq;
import com.baosight.bwhs.ma.amusing.response.SelectThankCardResp;
import com.baosight.bwhs.ma.amusing.response.SendThankCardRecordResp;
import com.baosight.bwhs.ma.amusing.service.IEmpThankcardService;
import com.baosight.bwhs.ma.amusing.service.IThankcardLibService;
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
@RequestMapping("SYSConstants.MOBILE_API_NAME+/amusing/thankcard")
public class ThankcardController extends BaseController {
    @Autowired
    IThankcardLibService iThankcardLibService;
    @Autowired
    IEmpThankcardService iEmpThankcardService;

    /**
     * 可送感谢卡
     *
     * @param
     * @return
     */
    @ApiOperation("可送感谢卡")
    @PostMapping(value = "/selectThankCard")
    @ResponseBody
    public JsonResult<Page<SelectThankCardResp>> selectThankCard(BaseRequest baseRequest) {
        //使用构造函数，里面有翻页初始化
        //Page<ThankcardOrg> pageOrg =new Page<>(baseRequest);

        Page<ThankcardLib> pageLib = new Page<>(baseRequest);
        QueryWrapper<ThankcardLib> query= new QueryWrapper<>();
        query.clear();

        //翻页对象
        pageLib = iThankcardLibService.page(pageLib, null);

        //entity转response
        List<Page<SelectThankCardResp>> list = Convert.convert(new TypeReference<List<Page<SelectThankCardResp>>>() {
        }, pageLib);
        return new JsonResult(list);
    }

    /**
     * 赠送感谢卡
     *
     * @param
     * @return
     */
    @ApiOperation("赠送感谢卡")
    @PostMapping(value = "/sendThankCard")
    @ResponseBody
    public JsonResult sendThankCard(SendThankCardReq sendThankCardReq) {
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
    public JsonResult<Page<SendThankCardRecordResp>> sendThankCardRecord(BaseRequest baseRequest) {
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
