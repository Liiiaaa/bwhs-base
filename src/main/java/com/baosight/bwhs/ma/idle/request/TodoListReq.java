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
public class TodoListReq extends BaseRequest {

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
}
