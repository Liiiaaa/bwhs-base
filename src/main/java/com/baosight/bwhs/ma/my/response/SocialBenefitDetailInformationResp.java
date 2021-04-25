package com.baosight.bwhs.ma.my.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 社保福利明细response
 *
 * @author makejava
 * @since 2021-03-08 13:46:23
 */
@ApiModel(value = "社保福利子类明细")
@Data
public class SocialBenefitDetailInformationResp extends BaseResponse {

    /**
     * 父类名称
     */
    @ApiModelProperty(value = "社保福利类型名称")
    private String kindName;

    /**
     * 子类总额
     */
    @ApiModelProperty(value = "总额")
    private BigDecimal sum;

	/**
	 * 子类个人额度
	 */
	@ApiModelProperty(value = "个人总额度")
	private List<BigDecimal> person;


	/**
	 * 企业额度
	 */
	@ApiModelProperty(value = "企业总额度")
	private List<BigDecimal> business;



}
