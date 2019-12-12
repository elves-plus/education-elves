package com.cloud.edu.service.impl;

import com.cloud.edu.dao.DeptDao;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;
import com.cloud.edu.entity.DeptEntity;
import com.cloud.edu.service.DeptService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;




@Service("deptService")
@Slf4j
public class DeptServiceImpl extends ServiceImpl<DeptDao, DeptEntity> implements DeptService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeptEntity> page = this.page(
                new Query<DeptEntity>().getPage(params),
                new QueryWrapper<DeptEntity>()
        );

        return new PageUtils(page);
    }

}
