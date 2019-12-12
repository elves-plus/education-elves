package com.cloud.edu.service.impl;

import com.cloud.edu.dao.MenuDao;
import com.cloud.edu.data.PageUtils;
import com.cloud.edu.data.Query;
import com.cloud.edu.entity.MenuEntity;
import com.cloud.edu.service.MenuService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 菜单管理
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 12:56:53
 */
@Service("menuService")
@Slf4j
public class MenuServiceImpl extends ServiceImpl<MenuDao, MenuEntity> implements MenuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MenuEntity> page = this.page(
                new Query<MenuEntity>().getPage(params),
                new QueryWrapper<MenuEntity>()
        );

        return new PageUtils(page);
    }

}
