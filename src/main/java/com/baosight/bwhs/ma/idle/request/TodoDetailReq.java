package com.baosight.bwhs.ma.idle.request;

import com.baosight.bwhs.common.domain.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel
public class TodoDetailReq extends BaseRequest {
    @ApiModelProperty(value = "主键",example = "12345678901234567890")
    private String guid;
    @ApiModelProperty(value = "标题",example = "工资条")
    private String title;
    @ApiModelProperty(value = "内容",example = "<b>2021年1月工资条</b><br>周洁</br><br>工资1000w</br>")
    private String content;
    @ApiModelProperty(value = "图片附件",example = "")
    private List<String> imgList;

}
