package com.cloud.edu.service;

import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.DeptEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.Map;

/**
 * 部门管理
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:41
 */
public interface DeptService extends IService<DeptEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

