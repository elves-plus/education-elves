package com.cloud.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.UserRoleEntity;


import java.util.Map;

/**
 * 用户与角色对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:41
 */
public interface UserRoleService extends IService<UserRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

