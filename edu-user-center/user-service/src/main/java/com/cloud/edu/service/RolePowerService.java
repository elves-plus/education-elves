package com.cloud.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.RolePowerEntity;


import java.util.Map;

/**
 * 角色与权限对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:42
 */
public interface RolePowerService extends IService<RolePowerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

