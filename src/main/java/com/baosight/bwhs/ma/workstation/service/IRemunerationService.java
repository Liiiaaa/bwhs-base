package com.baosight.bwhs.ma.workstation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baosight.bwhs.ma.my.entity.PaySlipType;
import com.baosight.bwhs.ma.workstation.entity.SalaryPayslip;
import com.baosight.bwhs.ma.workstation.response.RemunerationCostResp;

import java.math.BigDecimal;
import java.util.Map;

public interface IRemunerationService extends IService<SalaryPayslip> {

    /**
     *查询实发薪资、企业成本
     */
    RemunerationCostResp queryRemuneration(PaySlipType paySlipType);

    /**
     * 拆分大字段
     */
    Map<String,BigDecimal> breakUp(PaySlipType paySlipType);
}
