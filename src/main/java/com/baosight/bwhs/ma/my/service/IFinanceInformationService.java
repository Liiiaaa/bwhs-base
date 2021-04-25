package com.baosight.bwhs.ma.my.service;

import com.baosight.bwhs.ma.my.entity.FinanceInformation;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 银行金融机构 服务类
 * </p>
 *
 * @author jiwei
 * @since 2021-04-13
 */
public interface IFinanceInformationService extends IService<FinanceInformation> {
	List<FinanceInformation> queryFinanceOrgInformation();

}
