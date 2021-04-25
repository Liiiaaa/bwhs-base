package com.baosight.bwhs.ma.idle.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import lombok.Data;

@Data
public class MessageResp extends BaseResponse {
    String title;
    String content;
    String date;
    String messageId;
    String url;
    boolean read;
    boolean jump;
}
