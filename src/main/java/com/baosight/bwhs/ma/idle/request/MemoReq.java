package com.baosight.bwhs.ma.idle.request;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baosight.bwhs.common.domain.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 备忘录(Memo)request
 *
 * @author moyu
 * @since 2021-04-11 13:29:26
 */
@ApiModel(value = "备忘录")
@Data
public class MemoReq extends BaseRequest {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableField("GUID")
    private String guid;
    /**
     * 工号
     */
    @ApiModelProperty(value = "工号")
    @TableField("EMP_CODE")
    private String empCode;
    /**
     * 备忘标题
     */
    @ApiModelProperty(value = "备忘标题")
    @TableField("MEMO_TITLE")
    private String memoTitle;
    /**
     * 备忘内容
     */
    @ApiModelProperty(value = "备忘内容")
    @TableField("MEMO_CONTENT")
    private String memoContent;
    /**
     * 备忘时间
     */
    @ApiModelProperty(value = "备忘时间")
    @TableField("REMIND_DATE")
    private String remindDate;



}
