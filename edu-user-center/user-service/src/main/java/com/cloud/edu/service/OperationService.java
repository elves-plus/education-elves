package com.cloud.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.OperationEntity;


import java.util.Map;

/**
 * 操作
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:40
 */
public interface OperationService extends IService<OperationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

