package com.cloud.edu.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.edu.entity.GroupRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色与用户群组对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:41
 */
@Mapper
public interface GroupRoleDao extends BaseMapper<GroupRoleEntity> {

}
