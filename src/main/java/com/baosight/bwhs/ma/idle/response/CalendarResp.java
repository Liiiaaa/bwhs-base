package com.baosight.bwhs.ma.idle.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 日历
 */
@ApiModel
@Data
public class CalendarResp extends BaseResponse {
    @ApiModelProperty(value = "年")
    private String year;
    @ApiModelProperty(value = "月")
    private String month;
    @ApiModelProperty(value = "日")
    private String day;
    @ApiModelProperty(value = "星期几")
    private String daily;
    @ApiModelProperty(value = "显示消息")
    private String messageDisplay;
    @ApiModelProperty(value = "显示待办")
    private String todoDisplay;
    @ApiModelProperty(value = "显示备忘")
    private String memoDisplay;
}
