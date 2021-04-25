package com.baosight.bwhs.ma.amusing.request;

import com.baosight.bwhs.common.domain.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 送感谢卡
 */
@Data
@ApiModel
public class SendThankCardReq extends BaseRequest {
    @ApiModelProperty(value = "发送类型:E工号O机构T团队 默认使用E")
    private String senderType;
    @ApiModelProperty(value = "工号")
    private String[] receiveObjectCode;
    @ApiModelProperty(value = "感谢卡主键")
    private String thankCardGuid;
    @ApiModelProperty(value = "寄语")
    private String cardContent;

}
