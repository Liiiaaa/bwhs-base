package com.baosight.bwhs.ma.idle.controller;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.framework.core.page.Page;
import com.baosight.bwhs.ma.idle.entity.Memo;
import com.baosight.bwhs.ma.idle.request.TodoDetailReq;
import com.baosight.bwhs.ma.idle.request.TodoListReq;
import com.baosight.bwhs.ma.idle.response.TodoDetailResp;
import com.baosight.bwhs.ma.idle.response.TodoListResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 待办 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2021-04-11
 */
@Api(value = "闲-消息 ", tags = "闲-消息")
@RestController
@RequestMapping(SYSConstants.MOBILE_API_NAME+"/idle/todo")
public class TodoController {


    /**
     * 查询待办
     *
     * @param todoReq
     * @return 单条数据
     */
    @ApiOperation("查询待办列表")
    @PostMapping(value = "/queryTodo")
    @ResponseBody
    public JsonResult<Page<TodoListResp>> queryTodo(@RequestBody TodoListReq todoReq) {
        //request转entity
        Memo memo = new Memo();
        BeanUtil.copyProperties(todoReq, memo);
        //使用构造函数，里面有翻页初始化
        Page<Memo> page = new Page<>(todoReq);
        QueryWrapper<Memo> eWrapper = new QueryWrapper<>(memo);
        //清理条件，否则会有问题
        eWrapper.clear();
        return new JsonResult(page);
    }

    /**
     * 查询待办明细
     * @// TODO: 2021/4/15 需要使用id参数
     * @param todoReq
     * @return 单条数据
     */
    @ApiOperation("查询待办明细")
    @PostMapping(value = "/queryTodoDetail")
    @ResponseBody
    public JsonResult<TodoDetailResp> queryTodoDetail(@RequestBody TodoListReq todoReq) {
        TodoDetailResp bean = new TodoDetailResp();
        return new JsonResult(bean);
    }

    /**
     * 提交待办
     * @// TODO: 2021/4/15 需要使用id参数
     * @param todoDetailReq
     * @return 单条数据
     */
    @ApiOperation("提交待办")
    @PostMapping(value = "/commitTodo")
    @ResponseBody
    public JsonResult commitTodo(@RequestBody TodoDetailReq todoDetailReq) {
        TodoDetailResp bean = new TodoDetailResp();
        return new JsonResult(null);
    }

    /**
     * 回退待办
     * @// TODO: 2021/4/15 需要使用id参数
     * @param todoDetailReq
     * @return 单条数据
     */
    @ApiOperation("回退待办")
    @PostMapping(value = "/backTodo")
    @ResponseBody
    public JsonResult backTodo(@RequestBody TodoDetailReq todoDetailReq) {
        TodoDetailResp bean = new TodoDetailResp();
        return new JsonResult(null);
    }

}
