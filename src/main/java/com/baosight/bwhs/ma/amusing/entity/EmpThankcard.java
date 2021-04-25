package com.baosight.bwhs.ma.amusing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baosight.bwhs.common.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 人员感谢卡
 * </p>
 *
 * @author moyu
 * @since 2021-04-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "T_MA_EMP_THANKCARD", schema = "MA")
@ApiModel(value = "EmpThankcard对象", description = "人员感谢卡")
public class EmpThankcard extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "获取时间")
    @TableField("AWARD_DATE")
    private String awardDate;

    @ApiModelProperty(value = "感谢卡寄语")
    @TableField("CARD_CONTENT")
    private String cardContent;

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

    @TableId(value = "GUID", type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键")
    @TableField("GUID")
    private String guid;

    @ApiModelProperty(value = "接收对象编码:机构编码或者工号")
    @TableField("RECEIVE_OBJECT_CODE")
    private String receiveObjectCode;

    @ApiModelProperty(value = "接收对象名称")
    @TableField("RECEIVE_OBJECT_NAME")
    private String receiveObjectName;

    @ApiModelProperty(value = "发送类型:E人O机构T团队")
    @TableField("SENDER_TYPE")
    private String senderType;

    @ApiModelProperty(value = "感谢卡库")
    @TableField("THANKCARD_LIB_GUID")
    private String thankcardLibGuid;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATE_TIME")
    private String updateTime;

    @ApiModelProperty(value = "修改人")
    @TableField("UPDATE_USER")
    private String updateUser;


}
