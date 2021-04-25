package com.baosight.bwhs.ma.my.request;

import com.baosight.bwhs.common.domain.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *排行榜
 */
@Data
@ApiModel
public class LeaderBoardReq extends BaseRequest {
    @ApiModelProperty(value = "业务类型:M勋章F好友T感谢")
    private String rankType;
    @ApiModelProperty(value = "排名方式:A全集团C本公司F好友间")
    private String rankMethod;
}
