package com.cloud.edu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户群组管理
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:41
 */
@Data
@TableName("sys_group")
public class GroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long id;
	/**
	 * 上级用户群组ID，一级为0
	 */
	private Long parentId;
	/**
	 * 用户群组名称
	 */
	private String name;
	/**
	 * 排序
	 */
	private Integer orderNum;
	/**
	 * 是否删除  -1：已删除  0：正常
	 */
	private Integer delFlag;

}
