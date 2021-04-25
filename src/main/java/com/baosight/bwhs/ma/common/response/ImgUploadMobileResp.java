package com.baosight.bwhs.ma.common.response;


import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 图片返回
 */
@Data
@ApiModel(value="移动上传图片", description="移动上传图片")
public class ImgUploadMobileResp extends BaseResponse {
    /**
     * 主键
     */
    @ApiModelProperty(value = "图片主键")
    private String businessAnnexId;
}
