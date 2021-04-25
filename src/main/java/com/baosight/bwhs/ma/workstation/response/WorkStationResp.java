package com.baosight.bwhs.ma.workstation.response;

import com.baosight.bwhs.common.domain.BaseResponse;

import java.util.List;

/**
 * 工作台
 */
public class WorkStationResp extends BaseResponse {
    /**
     * 类型
     */
    String type;
    /**
     * 标题
     */
    String title;

    /**
     *是否显示
     */
    boolean show;
    /**
     * 数据对象
     */
    List<Object> menus;

}
