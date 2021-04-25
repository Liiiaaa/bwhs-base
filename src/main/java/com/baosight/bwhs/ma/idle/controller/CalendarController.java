package com.baosight.bwhs.ma.idle.controller;

import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.framework.core.BaseController;
import com.baosight.bwhs.framework.core.page.Page;
import com.baosight.bwhs.ma.idle.request.CalendarReq;
import com.baosight.bwhs.ma.idle.response.CalendarResp;
import com.baosight.bwhs.ma.idle.response.MemoResp;
import com.baosight.bwhs.ma.idle.response.RemindNumberResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * 日历
 */
@Api(value = "闲-日历", tags = "闲")
@RequestMapping(SYSConstants.MOBILE_API_NAME+"/idle/memo")
@RestController
public class CalendarController extends BaseController {
    /**
     * 查询日历
     *
     * @param calendarReq
     * @return
     */
    @ApiOperation("查询日历")
    @PostMapping(value = "/queryCalendar")
    @ResponseBody
    public JsonResult<Page<CalendarResp>> queryCalendar(@RequestBody CalendarReq calendarReq) {

        return new JsonResult(null);
    }

    /**
     * 查询消息待办备忘的未处理数据
     *
     * @param
     * @return
     */
    @ApiOperation("查询消息待办备忘的未处理数据")
    @PostMapping(value = "/remindNumber")
    @ResponseBody
    public JsonResult<RemindNumberResp> remindNumber() {
        RemindNumberResp remindNumberResp = new RemindNumberResp();
        remindNumberResp.setMemoNumber(9);
        remindNumberResp.setMessageNumber(6);
        remindNumberResp.setTodoNmumber(1000);
        return new JsonResult(remindNumberResp);
    }


}
