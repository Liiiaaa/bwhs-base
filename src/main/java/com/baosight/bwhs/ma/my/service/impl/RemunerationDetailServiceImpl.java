package com.baosight.bwhs.ma.my.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.ma.my.entity.PaySlipType;
import com.baosight.bwhs.ma.my.mapper.RemunerationDetailMapper;
import com.baosight.bwhs.ma.my.response.RemunerationDetailResp;
import com.baosight.bwhs.ma.my.service.IRemunerationDetailService;
import com.baosight.bwhs.ma.workstation.entity.SalaryPayslip;
import com.baosight.bwhs.ma.workstation.mapper.RemunerationMapper;
import com.baosight.bwhs.ma.workstation.response.RemunerationCostResp;
import com.baosight.bwhs.ma.workstation.service.IRemunerationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@DS("slave_1")
public class RemunerationDetailServiceImpl extends ServiceImpl<RemunerationDetailMapper, SalaryPayslip> implements IRemunerationDetailService {

    @Resource
    private RemunerationDetailMapper remunerationDetailMapper;

    @Resource
    private RemunerationMapper remunerationMapper;

    @Resource
    private IRemunerationService iRemunerationService;

    @Override
    public RemunerationDetailResp queryRemuneration(PaySlipType paySlipType) {
        RemunerationDetailResp remunerationDetailResp = new RemunerationDetailResp();
        /**
         * 查询所有工资固定项大类明细
         */
        ArrayList<Map<String, BigDecimal>> shouldPayList = new ArrayList<>();
        shouldPayList.add(iRemunerationService.breakUp(paySlipType));
        remunerationDetailResp.setShouldPayList(shouldPayList);
        return remunerationDetailResp;
    }
}