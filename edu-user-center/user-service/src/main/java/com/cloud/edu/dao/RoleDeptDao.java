package com.cloud.edu.dao;
import com.cloud.edu.entity.RoleDeptEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色与部门对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 12:56:53
 */
@Mapper
public interface RoleDeptDao extends BaseMapper<RoleDeptEntity> {

}
