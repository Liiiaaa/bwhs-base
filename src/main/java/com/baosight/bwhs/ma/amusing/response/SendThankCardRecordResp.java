package com.baosight.bwhs.ma.amusing.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 赠送记录
 */
@Data
@ApiModel
public class SendThankCardRecordResp extends BaseResponse {

    @ApiModelProperty(value = "主键")
    private String guid;
    @ApiModelProperty(value = "赠送记录消息")
    private String sendMsg;
    @ApiModelProperty(value = "赠送时间")
    private String sendDate;
    @ApiModelProperty(value = "感谢卡类型")
    private String thankcardType;
}
