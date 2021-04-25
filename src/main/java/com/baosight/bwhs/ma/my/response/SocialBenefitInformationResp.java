package com.baosight.bwhs.ma.my.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 社保福利response
 *
 * @author makejava
 * @since 2021-03-08 13:46:23
 */
@ApiModel(value = "社保福利-父类")
@Data
public class SocialBenefitInformationResp extends BaseResponse {

    /**
     * 父类名称
     */
    @ApiModelProperty(value = "父类名称")
    private String parentName;

    /**
     * 子类相关信息
     */
    @ApiModelProperty(value = "子类相关信息")
    private List<SocialBenefitSubInformationResp> childList;
}
