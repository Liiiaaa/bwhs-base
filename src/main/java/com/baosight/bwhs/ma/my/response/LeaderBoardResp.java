package com.baosight.bwhs.ma.my.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *排行榜
 */
@Data
@ApiModel
public class LeaderBoardResp extends BaseResponse {
    @ApiModelProperty(value = "对象类型:M我自己的排名O其他人的排名")
    private String objectType;
    @ApiModelProperty(value = "排名")
    private String rank;
    @ApiModelProperty(value = "姓名")
    private String empName;
    @ApiModelProperty(value = "头像照片")
    private String headortraitImg;
    @ApiModelProperty(value = "数量")
    private String num;
    @ApiModelProperty(value = "业务类型:M勋章F好友T感谢")
    private String rankType;
    @ApiModelProperty(value = "排名方式:A全集团C本公司F好友间")
    private String rankMethod;
}
