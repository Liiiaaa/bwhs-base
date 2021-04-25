package com.baosight.bwhs.ma.workstation.controller;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.TypeReference;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.common.utils.TokenUtil;
import com.baosight.bwhs.framework.core.BaseController;
import com.baosight.bwhs.ma.my.entity.PaySlipType;
import com.baosight.bwhs.ma.workstation.entity.SalaryPayslip;
import com.baosight.bwhs.ma.workstation.mapper.RemunerationMapper;
import com.baosight.bwhs.ma.workstation.request.RemunerationReq;
import com.baosight.bwhs.ma.workstation.response.RemunerationCostResp;
import com.baosight.bwhs.ma.workstation.service.IRemunerationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 移动端当月薪酬、企业成本 (RemunerationDetailController)控制层
 *
 * @author LiAng
 * @since 2021-04-15
 */

@Api(value = "移动端当月薪酬、企业成本-LiAng",tags = "移动端当月薪酬、企业成本 ")
@Controller
@RequestMapping(SYSConstants.MOBILE_API_NAME+"/remuneration")
public class RemunerationController extends BaseController {

    @Autowired
    private IRemunerationService iRemunerationService;

    /**
     * 查询员工薪资,企业成本
     * @param
     * @return
     */
    @ApiOperation(value = "查询员工应发工资,企业成本 queryRemuneration")
    @PostMapping(value = "/queryRemuneration")
    @ResponseBody
    public JsonResult<RemunerationCostResp> queryRemuneration(@ApiParam(value = "入参") @RequestBody RemunerationReq remunerationReq){
        PaySlipType paySlipType = new PaySlipType();
        paySlipType.setSetType(SYSConstants.SET_TYPE_3);
//        String tokenUserName = TokenUtil.getTokenUserName();
//        paySlipType.setEmpCode(tokenUserName);
        paySlipType.setEmpCode("L1");
        paySlipType.setCaclPeriod(remunerationReq.getCaclPeriod());
        RemunerationCostResp remunerationCostResp = iRemunerationService.queryRemuneration(paySlipType);
        return new JsonResult(remunerationCostResp);
    }
}