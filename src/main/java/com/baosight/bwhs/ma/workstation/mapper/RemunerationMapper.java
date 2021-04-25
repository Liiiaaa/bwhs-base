package com.baosight.bwhs.ma.workstation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baosight.bwhs.ma.my.entity.PaySlipType;
import com.baosight.bwhs.ma.workstation.entity.SalaryPayslip;
import com.baosight.bwhs.ma.workstation.response.RemunerationCostResp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 移动端员工薪酬 Mapper 接口
 * </p>
 *
 * @author LiAng
 * @since 2021-04-15
 */
@Repository
public interface RemunerationMapper extends BaseMapper<SalaryPayslip> {

    /**
     * 查询当月薪酬、企业成本
     */
    List<SalaryPayslip> queryRemuneration(PaySlipType paySlipType);

    /**
     * 根据显示类型，查询工资单配置主键ID
     */
    List<String> findGuidBySetType(String setType);
}
