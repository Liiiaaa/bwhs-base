package com.baosight.bwhs.ma.cs.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baosight.bwhs.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 客户服务内容表
 * </p>
 *
 * @author moyu
 * @since 2021-04-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("T_MA_CS_CONTNET")
@ApiModel(value="CsContnet对象", description="客户服务内容表")
public class CsContnet extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "联系方式")
    @TableField("CONTACT")
    private String contact;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private String createTime;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATE_USER")
    private String createUser;

    @ApiModelProperty(value = "内容")
    @TableField("CS_CONTENT")
    private String csContent;

    @ApiModelProperty(value = "问题种类小代码")
    @TableField("CS_KIND")
    private String csKind;

    @ApiModelProperty(value = "客服状态10待处理20处理中30已处理")
    @TableField("CS_STATUS")
    private String csStatus;

    @ApiModelProperty(value = "标题")
    @TableField("CS_TITLE")
    private String csTitle;

    @ApiModelProperty(value = "客服类型1故障2建议")
    @TableField("CS_TYPE")
    private String csType;

    @ApiModelProperty(value = "删除标记")
    @TableField("DELETE_FLAG")
    private String deleteFlag;

    @ApiModelProperty(value = "删除时间")
    @TableField("DELETE_TIME")
    private String deleteTime;

    @ApiModelProperty(value = "删除人")
    @TableField("DELETE_USER")
    private String deleteUser;

    @ApiModelProperty(value = "工号")
    @TableField("EMP_CODE")
    private String empCode;

    @ApiModelProperty(value = "主键")
    @TableField("GUID")
    private String guid;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATE_TIME")
    private String updateTime;

    @ApiModelProperty(value = "修改人")
    @TableField("UPDATE_USER")
    private String updateUser;


}
