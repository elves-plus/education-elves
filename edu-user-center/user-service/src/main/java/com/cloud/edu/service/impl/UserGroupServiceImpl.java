package com.cloud.edu.service.impl;

import com.cloud.edu.dao.UserGroupDao;
import com.cloud.edu.entity.UserGroupEntity;
import com.cloud.edu.service.UserGroupService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;




@Service("userGroupService")
@Slf4j
public class UserGroupServiceImpl extends ServiceImpl<UserGroupDao, UserGroupEntity> implements UserGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserGroupEntity> page = this.page(
                new Query<UserGroupEntity>().getPage(params),
                new QueryWrapper<UserGroupEntity>()
        );

        return new PageUtils(page);
    }

}
