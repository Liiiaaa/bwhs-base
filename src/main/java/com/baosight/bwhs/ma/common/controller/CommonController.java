package com.baosight.bwhs.ma.common.controller;

import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.framework.core.BaseController;
import com.baosight.bwhs.ma.common.request.ImgUploadMobileReq;
import com.baosight.bwhs.ma.common.response.ImgUploadMobileResp;
import com.baosight.bwhs.ma.cs.request.CsContentCommitReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 客户服务内容表 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2021-04-16
 */
@Api(value = "公用功能", tags = "公用功能-图片上传")
@RestController
public class CommonController extends BaseController {
    @ApiOperation("图片上传")
    @PostMapping(value = SYSConstants.MOBILE_API_NAME+"/common/imgUpload")
    @ResponseBody
    public JsonResult<ImgUploadMobileResp> imgUpload(@RequestBody ImgUploadMobileReq imgUploadMobileReq){
        ImgUploadMobileResp imgUploadMobileResp = new ImgUploadMobileResp();
        return new JsonResult(imgUploadMobileResp);
    }

    @ApiOperation("图片删除")
    @PostMapping(value = SYSConstants.MOBILE_API_NAME+"/common/imgDelete")
    @ResponseBody
    public JsonResult<ImgUploadMobileResp> imgDelete(@RequestBody ImgUploadMobileReq imgUploadMobileReq){
        ImgUploadMobileResp imgUploadMobileResp = new ImgUploadMobileResp();
        return new JsonResult(imgUploadMobileResp);
    }
}
