package com.cloud.edu.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.edu.entity.UserAccountEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统登录账号表
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:40
 */
@Mapper
public interface UserAccountDao extends BaseMapper<UserAccountEntity> {

}
