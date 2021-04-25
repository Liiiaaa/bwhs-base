package com.baosight.bwhs.ma.amusing.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baosight.bwhs.common.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 感谢卡库
 * </p>
 *
 * @author moyu
 * @since 2021-04-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "T_MA_THANKCARD_LIB", schema = "MA")
@ApiModel(value = "ThankcardLib对象", description = "感谢卡库")
public class ThankcardLib extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private String createTime;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATE_USER")
    private String createUser;

    @ApiModelProperty(value = "删除标记")
    @TableField("DELETE_FLAG")
    private String deleteFlag;

    @ApiModelProperty(value = "删除时间")
    @TableField("DELETE_TIME")
    private String deleteTime;

    @ApiModelProperty(value = "删除人")
    @TableField("DELETE_USER")
    private String deleteUser;

    @ApiModelProperty(value = "主键")
    @TableField("GUID")
    private String guid;

    @ApiModelProperty(value = "图片地址")
    @TableField("IMG_URL")
    private String imgUrl;

    @ApiModelProperty(value = "感谢卡描述")
    @TableField("THANKCARD_DESCRIBE")
    private String thankcardDescribe;

    @ApiModelProperty(value = "感谢卡名称")
    @TableField("THANKCARD_NAME")
    private String thankcardName;

    @ApiModelProperty(value = "感谢卡类型C公司L领导E员工")
    @TableField("THANKCARD_TYPE")
    private String thankcardType;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATE_TIME")
    private String updateTime;

    @ApiModelProperty(value = "修改人")
    @TableField("UPDATE_USER")
    private String updateUser;


}
