package com.cloud.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.GroupRoleEntity;


import java.util.Map;

/**
 * 角色与用户群组对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:41
 */
public interface GroupRoleService extends IService<GroupRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

