package com.baosight.bwhs.ma.my.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 社保福利明细response
 *
 * @author makejava
 * @since 2021-03-08 13:46:23
 */
@ApiModel(value = "社保福利-子类")
@Data
public class SocialBenefitSubInformationResp extends BaseResponse {

    /**
     * 父类名称
     */
    @ApiModelProperty(value = "子类名称")
    private String childName;

    /**
     * 子类总额
     */
    @ApiModelProperty(value = "子类总额")
    private BigDecimal sum;

	/**
	 * 子类个人额度
	 */
	@ApiModelProperty(value = "子类个人额度")
	private BigDecimal person;

	/**
	 * 企业额度
	 */
	@ApiModelProperty(value = "子类企业额度")
	private BigDecimal business;

}
