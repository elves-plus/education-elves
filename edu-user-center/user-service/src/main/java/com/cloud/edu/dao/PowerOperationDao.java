package com.cloud.edu.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.edu.entity.PowerOperationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色与功能对应关系
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:40
 */
@Mapper
public interface PowerOperationDao extends BaseMapper<PowerOperationEntity> {

}
