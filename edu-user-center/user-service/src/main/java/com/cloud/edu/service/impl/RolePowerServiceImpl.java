package com.cloud.edu.service.impl;

import com.cloud.edu.dao.RolePowerDao;
import com.cloud.edu.entity.RolePowerEntity;
import com.cloud.edu.service.RolePowerService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;




@Service("rolePowerService")
@Slf4j
public class RolePowerServiceImpl extends ServiceImpl<RolePowerDao, RolePowerEntity> implements RolePowerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RolePowerEntity> page = this.page(
                new Query<RolePowerEntity>().getPage(params),
                new QueryWrapper<RolePowerEntity>()
        );

        return new PageUtils(page);
    }

}
