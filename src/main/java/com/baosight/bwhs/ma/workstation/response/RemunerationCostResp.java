package com.baosight.bwhs.ma.workstation.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel(value = "员工薪酬、企业成本-响应对象")
@Data
public class RemunerationCostResp extends BaseResponse {

    @ApiModelProperty(value = "员工薪酬（应发工资）")
    private BigDecimal shouldSalary;

    @ApiModelProperty(value = "企业成本")
    private BigDecimal enterPriseCost;
}
