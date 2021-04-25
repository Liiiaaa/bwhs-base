package com.baosight.bwhs.ma.my.controller;

import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.ma.my.request.LeaderBoardReq;
import com.baosight.bwhs.ma.my.response.LeaderBoardResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 排行榜
 */
@Api(value = "排行榜", tags = "趣-排行榜")
@RestController
@RequestMapping(SYSConstants.MOBILE_API_NAME +"/my/leaderBoard")
public class LeaderboardController {

    @ApiOperation("我的感谢榜")
    @PostMapping(value = "/myLeaderBoard")
    @ResponseBody
    public JsonResult<List<LeaderBoardResp>> myLeaderBoard() {
        List<LeaderBoardResp> list = new ArrayList<>();
        return new JsonResult(list);
    }

    @ApiOperation("查询排行榜")
    @PostMapping(value = "/queryLeaderBoard")
    @ResponseBody
    public JsonResult<List<LeaderBoardResp>> queryLeaderBoard(LeaderBoardReq leaderBoardReq) {
        List<LeaderBoardResp> list = new ArrayList<>();
        return new JsonResult(list);
    }
}
