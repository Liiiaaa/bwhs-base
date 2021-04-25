package com.baosight.bwhs.ma.my.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baosight.bwhs.ma.my.entity.PaySlipType;
import com.baosight.bwhs.ma.my.response.RemunerationDetailResp;
import com.baosight.bwhs.ma.workstation.entity.SalaryPayslip;

public interface IRemunerationDetailService extends IService<SalaryPayslip> {

    /**
     * 查询员工历史薪酬
     */
    RemunerationDetailResp queryRemuneration(PaySlipType paySlipType);
}
