package com.baosight.bwhs.ma.my.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baosight.bwhs.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 银行金融机构
 * </p>
 *
 * @author jiwei
 * @since 2021-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("T_PB_FINANCE_ORG")
@ApiModel(value="FinanceOrg对象", description="银行金融机构")
public class FinanceInformation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "项目间分割符")
    @TableField("ITEM_SEPARATOR")
    private String itemSeparator;

    @ApiModelProperty(value = "行分隔符")
    @TableField("LINE_SEPARATOR")
    private String lineSeparator;

    @ApiModelProperty(value = "模板格式")
    @TableField("FILE_FORMAT")
    private String fileFormat;

    @ApiModelProperty(value = "扩展字段1")
    @TableField("EXT1")
    private String ext1;

    @ApiModelProperty(value = "扩展字段2")
    @TableField("EXT2")
    private String ext2;

    @ApiModelProperty(value = "扩展字段3")
    @TableField("EXT3")
    private String ext3;

    @ApiModelProperty(value = "组织机构代码")
    @TableField("ORG_CODE")
    private String orgCode;

    @ApiModelProperty(value = "计算管理区")
    @TableField("CALC_HRAREA_CODE")
    private String calcHrareaCode;

    @ApiModelProperty(value = "主键ID")
    @TableField("GUID")
    private String guid;

    @ApiModelProperty(value = "金融机构名称")
    @TableField("FINANCE_ORG_NAME")
    private String financeOrgName;

    @ApiModelProperty(value = "金融机构类型")
    @TableField("FINANCE_ORG_TYPE")
    private String financeOrgType;

    @ApiModelProperty(value = "支付类别代码")
    @TableField("PAY_METHOD_TYPE")
    private String payMethodType;

    @ApiModelProperty(value = "对应帐号")
    @TableField("FINANCE_ORG_ACCOUNT")
    private String financeOrgAccount;

    @ApiModelProperty(value = "所在省份")
    @TableField("PROVINCE")
    private String province;

    @ApiModelProperty(value = "所在城市")
    @TableField("CITY")
    private String city;

    @ApiModelProperty(value = "地址")
    @TableField("ADDRESS")
    private String address;

    @ApiModelProperty(value = "联系人")
    @TableField("LINKMAN")
    private String linkman;

    @ApiModelProperty(value = "电话")
    @TableField("TEL")
    private String tel;

    @ApiModelProperty(value = "是否必填联行号/网点代码")
    @TableField("TAEL_FLAG")
    private String taelFlag;

    @ApiModelProperty(value = "是否必填卡折类型")
    @TableField("REBATE_FLAG")
    private String rebateFlag;


}
