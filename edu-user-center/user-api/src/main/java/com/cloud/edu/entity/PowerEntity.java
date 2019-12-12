package com.cloud.edu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 12:56:53
 */
@Data
@TableName("sys_power")
public class PowerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long id;
	/**
	 * 权限组名称
	 */
	private String powerName;
	/**
	 * 扩展字段 1菜单 2接口 3 文件
	 */
	private Integer powerType;

}
