package com.cloud.edu.service;

import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.RoleDeptEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.Map;

/**
 * 角色与部门对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 12:56:53
 */
public interface RoleDeptService extends IService<RoleDeptEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

