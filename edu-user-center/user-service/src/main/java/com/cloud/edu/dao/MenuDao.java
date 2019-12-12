package com.cloud.edu.dao;
import com.cloud.edu.entity.MenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单管理
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 12:56:53
 */
@Mapper
public interface MenuDao extends BaseMapper<MenuEntity> {

}
