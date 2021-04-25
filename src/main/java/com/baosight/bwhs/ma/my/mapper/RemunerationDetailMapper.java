package com.baosight.bwhs.ma.my.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baosight.bwhs.ma.my.entity.PaySlipType;
import com.baosight.bwhs.ma.workstation.entity.SalaryPayslip;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RemunerationDetailMapper extends BaseMapper<SalaryPayslip> {

    /**
     *查询员工历史薪酬
     */
    List<SalaryPayslip> queryRemuneration(PaySlipType paySlipType);
}
