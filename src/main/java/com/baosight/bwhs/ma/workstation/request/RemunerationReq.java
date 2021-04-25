package com.baosight.bwhs.ma.workstation.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "移动端员工薪酬、企业成本查询-请求参数")
@Data
public class RemunerationReq{

    /**
     * 计薪周期
     */
    @ApiModelProperty(value = "计薪周期")
    private String caclPeriod;
}
