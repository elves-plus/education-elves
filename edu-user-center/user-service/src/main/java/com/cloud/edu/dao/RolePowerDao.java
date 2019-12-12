package com.cloud.edu.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.edu.entity.RolePowerEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色与权限对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:42
 */
@Mapper
public interface RolePowerDao extends BaseMapper<RolePowerEntity> {

}
