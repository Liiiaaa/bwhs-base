package com.baosight.bwhs.ma.idle.controller;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.framework.core.page.Page;
import com.baosight.bwhs.ma.idle.entity.Memo;
import com.baosight.bwhs.ma.idle.request.MemoReq;
import com.baosight.bwhs.ma.idle.response.MemoResp;
import com.baosight.bwhs.ma.idle.service.IMemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 备忘录 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2021-04-11
 */
@Api(value = "闲-备忘", tags = "闲-消息")
@RestController
@RequestMapping(SYSConstants.MOBILE_API_NAME+"/idle/msg")
public class MsgController {


    /**
     * 查询业务日志
     *
     * @param memoReq
     * @return 单条数据
     */
    @ApiOperation("查询消息")
    @PostMapping(value = "/queryMsg")
    @ResponseBody
    public JsonResult<Page<MemoResp>> queryMsg(@RequestBody MemoReq memoReq) {
        //request转entity
        Memo memo = new Memo();
        BeanUtil.copyProperties(memoReq, memo);
        //使用构造函数，里面有翻页初始化
        Page<Memo> page = new Page<>(memoReq);
        QueryWrapper<Memo> eWrapper = new QueryWrapper<>(memo);
        //清理条件，否则会有问题
        eWrapper.clear();
        return new JsonResult(null);
    }

}
