package com.baosight.bwhs.ma.my.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baosight.bwhs.common.utils.TokenUtil;
import com.baosight.bwhs.ma.my.entity.FinanceInformation;
import com.baosight.bwhs.ma.my.mapper.FinanceInformationMapper;
import com.baosight.bwhs.ma.my.service.IFinanceInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 银行金融机构 服务实现类
 * </p>
 *
 * @author jiwei
 * @since 2021-04-13
 */
@Service
@DS("slave_1")
public class FinanceInformationServiceImpl extends ServiceImpl<FinanceInformationMapper, FinanceInformation> implements
		IFinanceInformationService {
	@Autowired
	private FinanceInformationMapper financeInformationMapper;

	@Override
	public List<FinanceInformation> queryFinanceOrgInformation() {
		List<FinanceInformation> list = financeInformationMapper.queryFinanceOrgInformation(TokenUtil.getTokenUserName());
		return list;
	}
}
