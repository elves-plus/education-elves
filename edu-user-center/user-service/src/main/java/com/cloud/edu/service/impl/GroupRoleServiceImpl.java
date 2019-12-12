package com.cloud.edu.service.impl;

import com.cloud.edu.dao.GroupRoleDao;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;
import com.cloud.edu.entity.GroupRoleEntity;
import com.cloud.edu.service.GroupRoleService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;





@Service("groupRoleService")
@Slf4j
public class GroupRoleServiceImpl extends ServiceImpl<GroupRoleDao, GroupRoleEntity> implements GroupRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GroupRoleEntity> page = this.page(
                new Query<GroupRoleEntity>().getPage(params),
                new QueryWrapper<GroupRoleEntity>()
        );

        return new PageUtils(page);
    }

}
