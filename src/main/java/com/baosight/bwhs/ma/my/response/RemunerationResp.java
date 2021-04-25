package com.baosight.bwhs.ma.my.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ApiModel(value = "移动端员工薪酬-响应对象")
@Data
public class RemunerationResp extends BaseResponse {

    /**
     * 实发合计
     */
    @ApiModelProperty(value = "实发合计")
    private Map<String,BigDecimal> actualSalaryCombined;

    /**
     * 下拉列表（多个）
     */
    @ApiModelProperty(value = "下拉列表（多个）")
    private List<List<Map<String,BigDecimal>>> historySalary;

}
