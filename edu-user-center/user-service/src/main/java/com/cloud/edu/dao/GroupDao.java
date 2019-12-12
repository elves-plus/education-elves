package com.cloud.edu.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.edu.entity.GroupEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户群组管理
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:41
 */
@Mapper
public interface GroupDao extends BaseMapper<GroupEntity> {

}
