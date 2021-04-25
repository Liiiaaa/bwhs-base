package com.baosight.bwhs.ma.idle.response;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class MemoResp extends BaseResponse {
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
    /**
     * 创建时间
     */
    private String createTime;

}
