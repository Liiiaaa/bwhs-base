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
public class MsgReq extends BaseRequest {

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
     * 消息标题
     */
    @ApiModelProperty(value = "消息标题")
    private String msgTitle;
    /**
     * 消息内容
     */
    @ApiModelProperty(value = "消息内容")
    private String msgContent;
    /**
     * 消息时间
     */
    @ApiModelProperty(value = "消息时间")
    private String msgDate;

}
