package com.baosight.bwhs.ma.idle.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 待办提交或者驳回
 */
@Data
@ApiModel
public class TodoDetailResp extends BaseResponse {
    @ApiModelProperty(value = "主键")
    private String guid;
    @ApiModelProperty(value = "标题")
    private String title;
    @ApiModelProperty(value = "内容")
    private String content;
    @ApiModelProperty(value = "意见")
    private String suggest;
    @ApiModelProperty(value = "图片附件")
    private List<String> imgList;
    @ApiModelProperty(value = "提交是否显示")
    private String commitDisplay;
    @ApiModelProperty(value = "驳回是否显示")
    private String backDisplay;
    @ApiModelProperty(value = "提交api")
    private String commitApiUrl;
    @ApiModelProperty(value = "回退api")
    private String backApiUrl;
}
