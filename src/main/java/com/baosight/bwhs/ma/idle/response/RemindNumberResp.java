package com.baosight.bwhs.ma.idle.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 消息待办备忘提醒数量
 * @ClassName IdleNumber
 * @Description TODO
 * @Author inkfi
 * @Date 2021/4/15 20:55
 * @Version 1.0
 **/
@ApiModel
@Data
public class RemindNumberResp extends BaseResponse {
    @ApiModelProperty(value = "消息数量")
    int messageNumber;
    @ApiModelProperty(value = "待办数量")
    int todoNmumber;
    @ApiModelProperty(value = "备忘数量")
    int memoNumber;
}
