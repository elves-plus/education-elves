package com.cloud.edu.service;

import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.RoleEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.Map;

/**
 * 角色
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 12:56:53
 */
public interface RoleService extends IService<RoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

