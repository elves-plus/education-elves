package com.cloud.edu.service.impl;

import com.cloud.edu.dao.UserAccountDao;
import com.cloud.edu.entity.UserAccountEntity;
import com.cloud.edu.service.UserAccountService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;



@Service("userAccountService")
@Slf4j
public class UserAccountServiceImpl extends ServiceImpl<UserAccountDao, UserAccountEntity> implements UserAccountService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserAccountEntity> page = this.page(
                new Query<UserAccountEntity>().getPage(params),
                new QueryWrapper<UserAccountEntity>()
        );

        return new PageUtils(page);
    }

}
