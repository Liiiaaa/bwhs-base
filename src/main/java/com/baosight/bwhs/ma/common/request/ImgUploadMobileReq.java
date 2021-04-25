package com.baosight.bwhs.ma.common.request;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baosight.bwhs.common.domain.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 上传图片
 */
@Data
@ApiModel(value="移动上传图片", description="移动上传图片")
public class ImgUploadMobileReq extends BaseRequest {
    @ApiModelProperty(value = "业务代码")
    private String businessCode;
    @ApiModelProperty(value = "业务主键")
    private String businessId;
    @ApiModelProperty(value = "图片base64")
    private String imgBase64;
    @ApiModelProperty(value = "排序")
    private int sort;

}
