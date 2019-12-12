package com.cloud.edu.service.impl;

import com.cloud.edu.dao.OperationDao;
import com.cloud.edu.entity.OperationEntity;
import com.cloud.edu.service.OperationService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;




@Service("operationService")
@Slf4j
public class OperationServiceImpl extends ServiceImpl<OperationDao, OperationEntity> implements OperationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OperationEntity> page = this.page(
                new Query<OperationEntity>().getPage(params),
                new QueryWrapper<OperationEntity>()
        );

        return new PageUtils(page);
    }

}
