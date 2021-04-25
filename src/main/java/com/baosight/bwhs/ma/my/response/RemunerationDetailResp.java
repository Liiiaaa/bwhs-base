package com.baosight.bwhs.ma.my.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ApiModel(value = "员工薪酬详情（工资的组成部分）- 响应对象")
@Data
public class RemunerationDetailResp extends BaseResponse {

    /**
     * 实发工资
     */
    @ApiModelProperty(value = "实发工资")
    private Map<String,BigDecimal> actualSalary;

    /**
     * 应发工资、应发奖金、代扣合计整合List
     */
    @ApiModelProperty(value = "应发工资、应发奖金、代扣合计整合List")
    private List<Map<String,BigDecimal>> shouldPayList;

    /**
     * 下拉列表(多个)
     */
    @ApiModelProperty(value = "下拉列表（多个）")
    private List<List<Map<String,BigDecimal>>> salaryDetail;

}
