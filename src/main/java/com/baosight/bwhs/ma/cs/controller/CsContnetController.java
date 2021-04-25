package com.baosight.bwhs.ma.cs.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.BaseRequest;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.common.request.KeyReq;
import com.baosight.bwhs.ma.cs.request.CsContentCommitReq;
import com.baosight.bwhs.ma.cs.response.CsContentDetailResp;
import com.baosight.bwhs.ma.cs.response.HisCsContentResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.baosight.bwhs.framework.core.BaseController;

/**
 * <p>
 * 客户服务内容表 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2021-04-16
 */
@Api(value = "工作-感谢卡", tags = "客服")
@RestController
@RequestMapping(SYSConstants.MOBILE_API_NAME+"/cs/cs-contnet")
public class CsContnetController extends BaseController {

    @ApiOperation("提交问题建议")
    @PostMapping(value = "/commitCsContnet")
    @ResponseBody
    public JsonResult commitCsContnet(@RequestBody CsContentCommitReq csContentCommitReq){
        return new JsonResult(null);
    }

    @ApiOperation("历史问题建议已处理")
    @PostMapping(value = "/hisCsContnetProccess")
    @ResponseBody
    public JsonResult<Page<HisCsContentResp>> hisCsContnetProccess(BaseRequest baseRequest){
        Page<HisCsContentResp> page = new Page<>();
        return new JsonResult(page);
    }

    @ApiOperation("历史问题建议未处理")
    @PostMapping(value = "/hisCsContnetUnProccess")
    @ResponseBody
    public JsonResult<Page<HisCsContentResp>> hisCsContnetUnProccess(BaseRequest baseRequest){
        Page<HisCsContentResp> page = new Page<>();
        return new JsonResult(page);
    }

    @ApiOperation("历史问题建议未处理")
    @PostMapping(value = "/csContnetDetail")
    @ResponseBody
    public JsonResult<CsContentDetailResp> csContnetDetail(KeyReq keyReq){
        CsContentDetailResp csContentDetailResp = new CsContentDetailResp();
        return new JsonResult(csContentDetailResp);
    }
}
