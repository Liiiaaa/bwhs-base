package com.baosight.bwhs.ma.amusing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baosight.bwhs.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 机构感谢卡
 * </p>
 *
 * @author moyu
 * @since 2021-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "T_MA_THANKCARD_ORG",schema = "MA")
@ApiModel(value="ThankcardOrg对象", description="机构感谢卡")
public class ThankcardOrg extends BaseEntity {

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

    @ApiModelProperty(value = "管理区")
    @TableField("HRAREA_CODE")
    private String hrareaCode;

    @ApiModelProperty(value = "图片地址")
    @TableField("IMG_URL")
    private String imgUrl;

    @ApiModelProperty(value = "机构编码")
    @TableField("ORG_CODE")
    private String orgCode;

    @ApiModelProperty(value = "是否引用")
    @TableField("QUOTE_FLAG")
    private String quoteFlag;

    @ApiModelProperty(value = "感谢卡描述")
    @TableField("THANKCARD_DESCRIBE")
    private String thankcardDescribe;

    @ApiModelProperty(value = "感谢卡库主键")
    @TableField("THANKCARD_LIB_GUID")
    private String thankcardLibGuid;

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
