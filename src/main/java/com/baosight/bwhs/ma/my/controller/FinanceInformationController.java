package com.baosight.bwhs.ma.my.controller;

import cn.hutool.core.bean.BeanUtil;
import com.baosight.bwhs.common.SYSConstants;
import com.baosight.bwhs.common.domain.BaseRequest;
import com.baosight.bwhs.common.domain.JsonResult;
import com.baosight.bwhs.framework.core.page.Page;
import com.baosight.bwhs.ma.my.entity.FinanceInformation;
import com.baosight.bwhs.ma.my.response.FinanceInformationResp;
import com.baosight.bwhs.ma.my.response.SocialBenefitDetailInformationResp;
import com.baosight.bwhs.ma.my.response.SocialBenefitInformationResp;
import com.baosight.bwhs.ma.my.service.IFinanceInformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiParam;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 移动端-银行信息(Finance)控制层
 *
 * @author jiwei
 * @since
 */
@Api(value = "银行信息", tags = "移动端-银行信息")
@RestController
@RequestMapping(SYSConstants.MOBILE_API_NAME + "/my/financeInformation")
public class FinanceInformationController {

	@Autowired
	private IFinanceInformationService financeOrgService;


	/**
	 * 银行信息
	 * 通过员工唯一标识查询该员工所绑定的所有银行金融机构相关信息
	 *
	 * @param
	 * @return 多条数据
	 */
	@ApiOperation(value = "银行信息-通过员工唯一标识查询银行信息queryFinanceInformation")
	@PostMapping(value = "/queryFinanceInformation")
	@ResponseBody
	public JsonResult<Page<FinanceInformationResp>> queryFinanceInformation(BaseRequest baseRequest) {
		Page<FinanceInformationResp> financeInformationRespList = new Page<>();

		List<FinanceInformation> list = financeOrgService.queryFinanceOrgInformation();
		List<FinanceInformationResp> financeList = new ArrayList<>();

		FinanceInformationResp financeInformationResp;
		for(FinanceInformation financeInformation : list){
			financeInformationResp = new FinanceInformationResp();
			BeanUtil.copyProperties(financeInformation,financeInformationResp);
			financeList.add(financeInformationResp);
		}
		financeInformationRespList.setRecords(financeList);
		return new JsonResult(financeInformationRespList);
	}


	/**
	 * 银行信息
	 * 通过银行银行主键修改银行银行卡号
	 *
	 * @param
	 * @return
	 */
	@ApiOperation(value = "银行信息-通过银行银行主键修改银行银行卡号modifyFinanceInformation")
	@PostMapping(value = "/modifyFinanceInformation")
	@ResponseBody
	public JsonResult modifyFinanceInformation(@Validated @ApiParam(value = "银行ID", required = true) @NotBlank @RequestParam String id,@Validated @ApiParam(value = "账号", required = true) @NotBlank @RequestParam String account) {
		return new JsonResult(true,"200");
	}


	/**
	 * 社保信息
	 * 通过员工编号和年份查询社保信息
	 *
	 * @param
	 * @return
	 */
	@ApiOperation(value = "社保信息-通过员工编号和年份查询社保信息querySocialBenefitInformation")
	@PostMapping(value = "/querySocialBenefitInformation")
	@ResponseBody
	public JsonResult<List<SocialBenefitInformationResp>> querySocialBenefitInformation(@Validated @ApiParam(value = "年份", required = true) @NotBlank @RequestParam String year) {
		List<SocialBenefitInformationResp> list = new ArrayList<SocialBenefitInformationResp>();



		return new JsonResult(list);
	}



	/**
	 * 社保明细信息
	 * 通过员工编号、年份和社保类型查询社保明细信息
	 *
	 * @param
	 * @return
	 */
	@ApiOperation(value = "社保信息-通过员工编号和社保福利的小类querySocialBenefitKind")
	@ApiOperationSupport(order = 1)
	@PostMapping(value = "/querySocialBenefitKind")
	@ResponseBody
	public JsonResult<List<String>> querySocialBenefitKind(@Validated @ApiParam(value = "社保福利类别", required = true) @NotBlank @RequestParam String kind) {
		List<String>  strings = new ArrayList<String>();
		return new JsonResult(strings);
	}



	/**
	 * 社保明细信息
	 * 通过员工编号、年份和社保类型查询社保明细信息
	 *
	 * @param
	 * @return
	 */
	@ApiOperation(value = "社保信息-通过员工编号和年份查询社保明细信息querySocialBenefitDetailInformation")
	@ApiOperationSupport(order = 1)
	@PostMapping(value = "/querySocialBenefitDetailInformation")
	@ResponseBody
	public JsonResult<List<SocialBenefitDetailInformationResp>> querySocialBenefitDetailInformation(@Validated @ApiParam(value = "年份", required = true) @NotBlank @RequestParam String year,@Validated @ApiParam(value = "社保福利类别", required = true) @NotBlank @RequestParam String kind) {
		List<SocialBenefitDetailInformationResp> list = new ArrayList<SocialBenefitDetailInformationResp>();
		return new JsonResult(list);
	}





}
