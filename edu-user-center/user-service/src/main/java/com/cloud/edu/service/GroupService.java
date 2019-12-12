package com.cloud.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.entity.GroupEntity;


import java.util.Map;

/**
 * 用户群组管理
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:41
 */
public interface GroupService extends IService<GroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

