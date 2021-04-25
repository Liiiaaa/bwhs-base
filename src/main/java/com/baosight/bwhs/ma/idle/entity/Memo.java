package com.baosight.bwhs.ma.idle.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 备忘录
 * </p>
 *
 * @author moyu
 * @since 2021-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "T_MA_MEMO",schema = "ma")
public class Memo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private String createTime;

    /**
     * 创建人
     */
    @TableField("CREATE_USER")
    private String createUser;

    /**
     * 删除标记
     */
    @TableField("DELETE_FLAG")
    private String deleteFlag;

    /**
     * 删除时间
     */
    @TableField("DELETE_TIME")
    private String deleteTime;

    /**
     * 删除人
     */
    @TableField("DELETE_USER")
    private String deleteUser;

    /**
     * 工号
     */
    @TableField("EMP_CODE")
    private String empCode;

    /**
     * 主键
     */
    @TableField("GUID")
    @TableId(type = IdType.ASSIGN_ID)
    private String guid;

    /**
     * 备忘内容
     */
    @TableField("MEMO_CONTENT")
    private String memoContent;

    /**
     * 备忘标题
     */
    @TableField("MEMO_TITLE")
    private String memoTitle;

    /**
     * 备忘时间
     */
    @TableField("REMIND_DATE")
    private String remindDate;

    /**
     * 修改时间
     */
    @TableField("UPDATE_TIME")
    private String updateTime;

    /**
     * 修改人
     */
    @TableField("UPDATE_USER")
    private String updateUser;


}
