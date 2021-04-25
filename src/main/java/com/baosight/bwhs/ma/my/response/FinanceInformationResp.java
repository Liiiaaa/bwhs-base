package com.baosight.bwhs.ma.my.response;


import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;

/**
 * 银行金融机构(FinanceOrg)response
 *
 * @author makejava
 * @since 2021-03-08 13:46:23
 */
@ApiModel(value = "银行信息")
@Data
public class FinanceInformationResp extends BaseResponse {

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    private String guid;
    /**
     * 金融机构名称
     */
    @ApiModelProperty(value = "金融机构名称")
    private String financeOrgName;
    /**
     * 银行机构类型
     */
    @ApiModelProperty(value = "银行机构类型")
    private String financeOrgType;
    /**
     * 支付类别代码
     */
    @ApiModelProperty(value = "支付类别代码")
    private ArrayList<String> rebateType;
    /**
     * 对应帐号
     */
    @ApiModelProperty(value = "对应帐号")
    private String cardNo;

}
