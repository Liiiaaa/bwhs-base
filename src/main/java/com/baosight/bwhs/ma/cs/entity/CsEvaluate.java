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
 * 客户服务评价
 * </p>
 *
 * @author moyu
 * @since 2021-04-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("T_MA_CS_EVALUATE")
@ApiModel(value="CsEvaluate对象", description="客户服务评价")
public class CsEvaluate extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private String createTime;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATE_USER")
    private String createUser;

    @ApiModelProperty(value = "工号")
    @TableField("CS_GUID")
    private String csGuid;

    @ApiModelProperty(value = "删除标记")
    @TableField("DELETE_FLAG")
    private String deleteFlag;

    @ApiModelProperty(value = "删除时间")
    @TableField("DELETE_TIME")
    private String deleteTime;

    @ApiModelProperty(value = "删除人")
    @TableField("DELETE_USER")
    private String deleteUser;

    @ApiModelProperty(value = "评价")
    @TableField("EVALUATE")
    private String evaluate;

    @ApiModelProperty(value = "主键")
    @TableField("GUID")
    private String guid;

    @ApiModelProperty(value = "评分1-5")
    @TableField("SCORE")
    private Integer score;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATE_TIME")
    private String updateTime;

    @ApiModelProperty(value = "修改人")
    @TableField("UPDATE_USER")
    private String updateUser;


}
