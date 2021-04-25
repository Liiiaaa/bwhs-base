package com.baosight.bwhs.ma.cs.response;

import com.baosight.bwhs.common.domain.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 提交意见反馈
 */
@Data
@ApiModel(value="意见反馈明细", description="意见反馈明细")
public class CsContentDetailResp extends BaseRequest {
    @ApiModelProperty(value = "联系方式")
    private String contact;

    @ApiModelProperty(value = "内容")
    private String csContent;

    @ApiModelProperty(value = "客服状态10待处理20处理中30已处理")
    private String csStatus;

    @ApiModelProperty(value = "标题")
    private String csTitle;

    @ApiModelProperty(value = "客服类型1故障2建议")
    private String csType;

    @ApiModelProperty(value = "主键")
    private String guid;

    @ApiModelProperty(value = "问题种类小代码")
    private String csKind;

    /**
     * 图片列表
     */
    @ApiModelProperty(value = "图片列表")
    List<String> imgUrlList;

    @ApiModelProperty(value = "反馈")
    private String feedbackContent;

    @ApiModelProperty(value = "反馈图片")
    List feedbakImgUrlList;

}
