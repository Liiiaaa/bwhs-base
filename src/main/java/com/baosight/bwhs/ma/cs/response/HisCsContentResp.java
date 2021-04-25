package com.baosight.bwhs.ma.cs.response;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baosight.bwhs.common.domain.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 提交意见反馈
 */
@Data
@ApiModel(value="提交意见反馈", description="提交意见反馈")
public class HisCsContentResp extends BaseRequest {

    @ApiModelProperty(value = "内容")
    private String csContent;


    @ApiModelProperty(value = "标题")
    private String csTitle;

    @ApiModelProperty(value = "主键")
    private String guid;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private String createTime;


}
