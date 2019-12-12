package com.cloud.edu.service.impl;

import com.cloud.edu.dao.GroupDao;
import com.cloud.edu.entity.GroupEntity;
import com.cloud.edu.service.GroupService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;




@Service("groupService")
@Slf4j
public class GroupServiceImpl extends ServiceImpl<GroupDao, GroupEntity> implements GroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GroupEntity> page = this.page(
                new Query<GroupEntity>().getPage(params),
                new QueryWrapper<GroupEntity>()
        );

        return new PageUtils(page);
    }

}
