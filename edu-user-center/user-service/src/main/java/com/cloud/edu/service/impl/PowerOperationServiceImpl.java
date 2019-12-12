package com.cloud.edu.service.impl;

import com.cloud.edu.dao.PowerOperationDao;
import com.cloud.edu.entity.PowerOperationEntity;
import com.cloud.edu.service.PowerOperationService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;



@Service("powerOperationService")
@Slf4j
public class PowerOperationServiceImpl extends ServiceImpl<PowerOperationDao, PowerOperationEntity> implements PowerOperationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PowerOperationEntity> page = this.page(
                new Query<PowerOperationEntity>().getPage(params),
                new QueryWrapper<PowerOperationEntity>()
        );

        return new PageUtils(page);
    }

}
