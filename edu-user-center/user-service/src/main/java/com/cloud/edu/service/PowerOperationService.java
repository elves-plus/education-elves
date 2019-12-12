package com.cloud.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.PowerOperationEntity;


import java.util.Map;

/**
 * 角色与功能对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:40
 */
public interface PowerOperationService extends IService<PowerOperationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

