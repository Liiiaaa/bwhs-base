package com.baosight.bwhs.ma.idle.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class TodoListResp extends BaseResponse {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private String guid;
    /**
     * 工号
     */
    @ApiModelProperty(value = "工号")
    private String empCode;
    /**
     * 代办标题
     */
    @ApiModelProperty(value = "代办标题")
    private String title;
    /**
     * 代办内容
     */
    @ApiModelProperty(value = "代办内容")
    private String content;
    /**
     * 代办时间
     */
    @ApiModelProperty(value = "代办时间")
    private String todoDate;

    @ApiModelProperty(value = "代办状态:W待审批，P审批通过，B审批驳回，")
    private String todoStatus;

    @ApiModelProperty(value = "到期时间")
    private String endDate;

    @ApiModelProperty(value = "url")
    String url;

    @ApiModelProperty(value = "处理状态Y已处理N未处理")
    boolean proccessStatus;

    @ApiModelProperty(value = "跳转状态Y跳转url N跳转通用处理")
    boolean jumpStatus;

}
