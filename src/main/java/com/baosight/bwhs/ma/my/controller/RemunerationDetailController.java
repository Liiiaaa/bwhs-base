package com.baosight.bwhs.ma.my.controller;

import cn.hutool.core.bean.BeanUtil;
import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.common.utils.TokenUtil;
import com.baosight.bwhs.framework.core.BaseController;
import com.baosight.bwhs.ma.my.entity.PaySlipType;
import com.baosight.bwhs.ma.my.response.RemunerationBriefResp;
import com.baosight.bwhs.ma.my.response.RemunerationDetailResp;
import com.baosight.bwhs.ma.my.response.RemunerationResp;
import com.baosight.bwhs.ma.my.service.IRemunerationDetailService;
import com.baosight.bwhs.ma.workstation.entity.SalaryPayslip;
import com.baosight.bwhs.ma.workstation.request.RemunerationReq;
import com.baosight.bwhs.ma.workstation.response.RemunerationCostResp;
import com.baosight.bwhs.ma.workstation.service.IRemunerationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 移动端薪酬明细(RemunerationController)控制层
 *
 * @author LiAng
 * @since 2021-04-15
 */

@Api(value = "移动端员工薪酬明细-LiAng",tags = "移动端员工薪酬明细")
@Controller
@RequestMapping(value = SYSConstants.MOBILE_API_NAME+"/remunerationDetail")
public class RemunerationDetailController extends BaseController {

    @Resource
    private IRemunerationDetailService iRemunerationDetailService;

    /**
     * 历史薪酬
     * @param remunerationReq
     * @return
     */
    @ApiOperation(value = "查询员工历史薪酬 queryHistoryRemunerationDetail")
    @PostMapping(value = "/queryHistoryRemunerationDetail")
    @ResponseBody
    public JsonResult<List<RemunerationResp>> queryHistoryRemunerationDetail(@ApiParam(value = "入参") @RequestBody RemunerationReq remunerationReq){
        return new JsonResult<>(null);
    }

    /**
     * 根据年月查询员工每月工资详情（工资组成）
     * @param remunerationReq
     * @return
     */
    @ApiOperation(value = "根据年月查询员工每月工资详情（工资组成）queryRemunerationDetailForDate")
    @PostMapping("/queryRemunerationDetailForDate")
    @ResponseBody
    public JsonResult<RemunerationDetailResp> queryRemunerationDetailForDate(@ApiParam(value = "入参") @RequestBody RemunerationReq remunerationReq){
        PaySlipType paySlipType = new PaySlipType();
//        String tokenUserName = TokenUtil.getTokenUserName();
//        paySlipType.setEmpCode(tokenUserName);
        paySlipType.setEmpCode("L1");
        paySlipType.setSetType(SYSConstants.SET_TYPE_0);
        paySlipType.setCaclPeriod(remunerationReq.getCaclPeriod());
        RemunerationDetailResp remunerationDetailResp = iRemunerationDetailService.queryRemuneration(paySlipType);
        return new JsonResult(remunerationDetailResp);
    }

    /**
     * 历史薪酬（统计图）
     * @param remunerationReq
     * @return
     */
    @ApiOperation(value = "查询员工历史薪酬（统计图） queryHistoryRemunerationBrief")
    @PostMapping(value = "/queryHistoryRemunerationBrief")
    @ResponseBody
    public JsonResult<List<RemunerationBriefResp>> queryHistoryRemunerationBrief(@ApiParam(value = "入参") @RequestBody RemunerationReq remunerationReq){
        return null;
    }
}
