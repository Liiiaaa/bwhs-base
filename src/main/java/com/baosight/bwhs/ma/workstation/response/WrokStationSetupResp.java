package com.baosight.bwhs.ma.workstation.response;

import com.baosight.bwhs.common.domain.BaseResponse;
import lombok.Data;
/**
 * 工作台设置
 */
@Data
public class WrokStationSetupResp extends BaseResponse {
    /**
     * 菜单名称
     */
    String menu;
    /**
     * 是否显示
     */
    String display;
}
