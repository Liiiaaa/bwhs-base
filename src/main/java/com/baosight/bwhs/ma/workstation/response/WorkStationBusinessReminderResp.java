package com.baosight.bwhs.ma.workstation.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import lombok.Data;

/**
 * 工作台提醒模块
 */
@Data
public class WorkStationBusinessReminderResp extends BaseResponse {
    /**
     * 图片地址
     */
    String image;
    /**
     * 显示文字
     */
    String text;
    /**
     * api地址
     */
    String url;
}
