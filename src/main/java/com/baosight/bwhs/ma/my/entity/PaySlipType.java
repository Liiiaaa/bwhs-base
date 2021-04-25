package com.baosight.bwhs.ma.my.entity;

import com.baosight.bwhs.ma.workstation.entity.SalaryPayslip;
import lombok.Data;

import java.io.Serializable;

@Data
public class PaySlipType extends SalaryPayslip implements Serializable {
    private static final long serialVersionUID = 3723227803241401549L;

    /**
     *工资单固定项
     */
    private String setType;
}
