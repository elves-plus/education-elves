package com.cloud.edu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 操作
 *
 * @author xianliru
 * @email xianliru@163.com
 * @date 2019-12-12 11:21:40
 */
@Data
@TableName("sys_operation")
public class OperationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long id;
	/**
	 * 操作 0 添加 1 删 2 修改
	 */
	private String operation;
	/**
	 * 操作描述
	 */
	private String operationDesc;

}
