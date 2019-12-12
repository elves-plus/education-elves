package com.cloud.edu.service.impl;

import com.cloud.edu.dao.PowerDao;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;
import com.cloud.edu.entity.PowerEntity;
import com.cloud.edu.service.PowerService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 权限
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 12:56:53
 */
@Service("powerService")
@Slf4j
public class PowerServiceImpl extends ServiceImpl<PowerDao, PowerEntity> implements PowerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PowerEntity> page = this.page(
                new Query<PowerEntity>().getPage(params),
                new QueryWrapper<PowerEntity>()
        );

        return new PageUtils(page);
    }

}
