package com.baosight.bwhs.ma.my.mapper;

import com.baosight.bwhs.ma.my.entity.FinanceInformation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 银行金融机构 Mapper 接口
 * </p>
 *
 * @author jiwei
 * @since 2021-04-13
 */
@Component
public interface FinanceInformationMapper extends BaseMapper<FinanceInformation> {

	List<FinanceInformation> queryFinanceOrgInformation(String empCode);
}
