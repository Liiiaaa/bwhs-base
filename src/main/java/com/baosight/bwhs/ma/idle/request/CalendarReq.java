package com.baosight.bwhs.ma.idle.request;

import com.baosight.bwhs.common.domain.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 日历
 */
@Data
public class CalendarReq extends BaseRequest {
    @ApiModelProperty(value = "年")
    private String year;
    @ApiModelProperty(value = "月")
    private String month;
    @ApiModelProperty(value = "年月")
    private String yearMon;
}
