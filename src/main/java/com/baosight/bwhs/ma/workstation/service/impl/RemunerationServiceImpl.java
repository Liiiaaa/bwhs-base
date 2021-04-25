package com.baosight.bwhs.ma.workstation.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.ma.my.entity.PaySlipType;
import com.baosight.bwhs.ma.workstation.entity.SalaryPayslip;
import com.baosight.bwhs.ma.workstation.mapper.RemunerationMapper;
import com.baosight.bwhs.ma.workstation.response.RemunerationCostResp;
import com.baosight.bwhs.ma.workstation.service.IRemunerationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@DS("slave_1")
public class RemunerationServiceImpl extends ServiceImpl<RemunerationMapper,SalaryPayslip> implements IRemunerationService {

    @Resource
    private RemunerationMapper remunerationMapper;

    /**
     * 查询实发工资、企业成本
     * @param paySlipType
     * @return
     */
    @Override
    public RemunerationCostResp queryRemuneration(PaySlipType paySlipType) {
        RemunerationCostResp remunerationCostResp = new RemunerationCostResp();
        /**
         * 获取企业成本
         */
        List<SalaryPayslip> salaryPayslips = remunerationMapper.queryRemuneration(paySlipType);
        Double aDouble = 0.0;
        List<String> guidList = remunerationMapper.findGuidBySetType(paySlipType.getSetType());
        for (SalaryPayslip salaryPayslip : salaryPayslips){
            String calcResult = salaryPayslip.getCalcResultList();
            String[] split = calcResult.replaceAll("\\[", "").replaceAll("]", "")
                    .split("},");
            for (String s:split){
                for (String guid : guidList){
                    if (s.contains(guid)){
                        String[] result = s.split(",");
                        String[] str = result[0].split(":");
                        aDouble += Double.parseDouble(str[1].trim());
                        String ss = "";
                    }
                }
            }
        }

        /**
         * 获取当月薪酬
         */
        paySlipType.setSetType(SYSConstants.SET_TYPE_0);
        List<SalaryPayslip> salaryPayslipList = remunerationMapper.queryRemuneration(paySlipType);
        BigDecimal acutalAmount = new BigDecimal(0);
        for (SalaryPayslip salaryPayslip : salaryPayslipList){
            BigDecimal bigDecimal = acutalAmount.add(salaryPayslip.getAcutalAmount());
            acutalAmount = bigDecimal;
        }
        remunerationCostResp.setEnterPriseCost(BigDecimal.valueOf(aDouble));
        remunerationCostResp.setShouldSalary(acutalAmount);
        return remunerationCostResp;
    }

    /**
     * 拆分大字段
     */
    public Map<String,BigDecimal> breakUp(PaySlipType paySlipType){
        List<SalaryPayslip> salaryPayslips = remunerationMapper.queryRemuneration(paySlipType);
        Double enterPriseCost = 0.0;
        List<String> guidList = remunerationMapper.findGuidBySetType(paySlipType.getSetType());
        for (SalaryPayslip salaryPayslip : salaryPayslips){
            String calcResult = salaryPayslip.getCalcResultList();
            String[] split = calcResult.replaceAll("\\[", "").replaceAll("]", "")
                    .split("},");
            for (String s:split){
                for (String guid : guidList){
                    if (s.contains(guid)){
                        String[] result = s.split(",");
                        String[] str = result[0].split(":");
                        enterPriseCost += Double.parseDouble(str[1].trim());
                    }
                }
            }
        }
        BigDecimal bigDecimal = new BigDecimal(enterPriseCost);
        HashMap<String, BigDecimal> map = new HashMap<>();
        map.put("aaa",bigDecimal);
        return map;
    }
}