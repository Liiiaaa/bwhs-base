package com.baosight.bwhs.ma.idle.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baosight.bwhs.common.exception.BusinessException;
import com.baosight.bwhs.ma.idle.entity.Memo;
import com.baosight.bwhs.ma.idle.mapper.MemoMapper;
import com.baosight.bwhs.ma.idle.service.IMemoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 备忘录 服务实现类
 * </p>
 *
 * @author moyu
 * @since 2021-04-11
 */

@Service
public class MemoServiceImpl extends ServiceImpl<MemoMapper, Memo> implements IMemoService {

    /**
     * 测试事务和多数据源
     */
    @Transactional(rollbackFor = Exception.class)
    @DS("slave_1")
    @Override
    public void test() {
        Memo bean;
        bean=new Memo();
        bean.setMemoTitle("11111");
        bean.setMemoTitle("44444");
        baseMapper.insert(bean);
        bean=new Memo();
        bean.setMemoTitle("22222");
        bean.setMemoTitle("55555");
        baseMapper.insert(bean);
        if(1==1) {
            throw new BusinessException("");
        }
    }
}
