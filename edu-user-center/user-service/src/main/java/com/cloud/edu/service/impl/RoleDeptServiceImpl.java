package com.cloud.edu.service.impl;

import com.cloud.edu.dao.RoleDeptDao;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;
import com.cloud.edu.entity.RoleDeptEntity;
import com.cloud.edu.service.RoleDeptService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 角色与部门对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 12:56:53
 */
@Service("roleDeptService")
@Slf4j
public class RoleDeptServiceImpl extends ServiceImpl<RoleDeptDao, RoleDeptEntity> implements RoleDeptService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RoleDeptEntity> page = this.page(
                new Query<RoleDeptEntity>().getPage(params),
                new QueryWrapper<RoleDeptEntity>()
        );

        return new PageUtils(page);
    }

}
