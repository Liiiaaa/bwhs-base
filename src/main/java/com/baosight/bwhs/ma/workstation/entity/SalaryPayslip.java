package com.baosight.bwhs.ma.workstation.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baosight.bwhs.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import java.sql.Clob;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 员工工资单
 * </p>
 *
 * @author LiAng
 * @since 2021-04-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "T_PB_SALARY_PAYSLIP",schema = "PB",excludeProperty = {"orderBy","pageLimit","pageOffset","totalCount"})
@ApiModel(value="SalaryPayslip对象", description="员工工资单")
public class SalaryPayslip extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableField("GUID")
    private String guid;

    @ApiModelProperty(value = "薪资组主键")
    @TableField("SALARY_CONFIG_ID")
    private String salaryConfigId;

    @ApiModelProperty(value = "薪资组计算过程主键")
    @TableField("SALARY_PAYROLL_ID")
    private String salaryPayrollId;

    @ApiModelProperty(value = "工资单配置主键")
    @TableField("PAYSLIP_GROUP_ID")
    private String payslipGroupId;

    @ApiModelProperty(value = "计算管理区")
    @TableField("CALC_HRAREA_CODE")
    private String calcHrareaCode;

    @ApiModelProperty(value = "薪酬模式")
    @TableField("ITEM_PROJECT_ID")
    private String itemProjectId;

    @ApiModelProperty(value = "支付账号")
    @TableField("PAYMENT_AMOUNT")
    private String paymentAmount;

    @ApiModelProperty(value = "金融机构")
    @TableField("FINANCE_ORG_CODE")
    private String financeOrgCode;

    @ApiModelProperty(value = "岗位")
    @TableField("POST_CODE")
    private String postCode;

    @ApiModelProperty(value = "岗位薪级")
    @TableField("SALARY_SCALE")
    private String salaryScale;

    @ApiModelProperty(value = "支付币种：人民币、港币")
    @TableField("CALC_CURRENCY")
    private String calcCurrency;

    @ApiModelProperty(value = "支付方式： 工资 、 奖金、通讯补贴、 待退休补偿金 、零星奖金、 报支 、车贴、 返聘")
    @TableField("PAY_MODE")
    private String payMode;

    @ApiModelProperty(value = "应发额")
    @TableField("PAY_AMOUNT")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "实发额")
    @TableField("ACUTAL_AMOUNT")
    private BigDecimal acutalAmount;

    @ApiModelProperty(value = "个税缴纳额")
    @TableField("TAX_AMOUNT")
    private BigDecimal taxAmount;

    @ApiModelProperty(value = "个税缴实缴")
    @TableField("ACUTAL_TAX_AMOUNT")
    private BigDecimal acutalTaxAmount;

    @ApiModelProperty(value = "项目结果集:配置类大类集合")
    @TableField("CALC_RESULT_LIST")
    private String calcResultList;

    @ApiModelProperty(value = "提交人")
    @TableField("SUBMIT_USER")
    private String submitUser;

    @ApiModelProperty(value = "提交日期")
    @TableField("SUBMIT_TIME")
    private String submitTime;

    @ApiModelProperty(value = "扩展字段1")
    @TableField("EXT1")
    private String ext1;

    @ApiModelProperty(value = "扩展字段2")
    @TableField("EXT2")
    private String ext2;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATE_USER")
    private String createUser;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private String createTime;

    @ApiModelProperty(value = "修改人")
    @TableField("UPDATE_USER")
    private String updateUser;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATE_TIME")
    private String updateTime;

    @ApiModelProperty(value = "删除人")
    @TableField("DELETE_USER")
    private String deleteUser;

    @ApiModelProperty(value = "删除时间")
    @TableField("DELETE_TIME")
    private String deleteTime;

    @ApiModelProperty(value = "删除标记（1无效、0有效）")
    @TableField("DELETE_FLAG")
    private String deleteFlag;

    @ApiModelProperty(value = "工号")
    @TableField("EMP_CODE")
    private String empCode;

    @ApiModelProperty(value = "姓名")
    @TableField("EMP_NAME")
    private String empName;

    @ApiModelProperty(value = "员工所在机构")
    @TableField("ORG_CODE")
    private String orgCode;

    @ApiModelProperty(value = "组织全路径")
    @TableField("ORG_PATH")
    private String orgPath;

    @ApiModelProperty(value = "机构名称")
    @TableField("ORG_NAME")
    private String orgName;

    @ApiModelProperty(value = "机构名称全路径")
    @TableField("ORG_FULL_NAME")
    private String orgFullName;

    @ApiModelProperty(value = "计薪周期")
    @TableField("CACL_PERIOD")
    private String caclPeriod;


}
