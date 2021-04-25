package com.baosight.bwhs.ma.amusing.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 可选感谢卡
 */
@Data
@ApiModel
public class SelectThankCardResp extends BaseResponse {

    @ApiModelProperty(value = "主键")
    private String guid;

    @ApiModelProperty(value = "感谢卡名称")
    private String thankcardName;

    @ApiModelProperty(value = "图片地址")
    private String imgUrl;
}
