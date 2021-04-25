package com.baosight.bwhs.ma.my.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ApiModel(value = "历史薪酬（统计图）- 响应对象")
@Data
public class RemunerationBriefResp extends BaseResponse {

    /**
     * 累计应发
     */
    @ApiModelProperty(value = "累计应发")
    private BigDecimal cumulativeShouldPay;

    /**
     * 每月工资、奖金、企业成本List
     */
    private Map<String,List<Map<String,BigDecimal>>> payList;

}
