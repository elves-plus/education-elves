package com.cloud.edu.service;

import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.PowerEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.Map;

/**
 * 权限
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 12:56:53
 */
public interface PowerService extends IService<PowerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

