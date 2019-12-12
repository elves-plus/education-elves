package com.cloud.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.UserEntity;


import java.util.Map;

/**
 * 系统用户
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:42
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

