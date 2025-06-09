package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 下载小说
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-07 10:13:34
 */
@TableName("xiazaixiaoshuo")
public class XiazaixiaoshuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiazaixiaoshuoEntity() {
		
	}
	
	public XiazaixiaoshuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 小说名称
	 */
					
	private String xiaoshuomingcheng;
	
	/**
	 * 小说分类
	 */
					
	private String xiaoshuofenlei;
	
	/**
	 * 读者账号
	 */
					
	private String duzhezhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 小说文件
	 */
					
	private String xiaoshuowenjian;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 作者账号
	 */
					
	private String zuozhezhanghao;
	
	/**
	 * 作者姓名
	 */
					
	private String zuozhexingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：小说名称
	 */
	public void setXiaoshuomingcheng(String xiaoshuomingcheng) {
		this.xiaoshuomingcheng = xiaoshuomingcheng;
	}
	/**
	 * 获取：小说名称
	 */
	public String getXiaoshuomingcheng() {
		return xiaoshuomingcheng;
	}
	/**
	 * 设置：小说分类
	 */
	public void setXiaoshuofenlei(String xiaoshuofenlei) {
		this.xiaoshuofenlei = xiaoshuofenlei;
	}
	/**
	 * 获取：小说分类
	 */
	public String getXiaoshuofenlei() {
		return xiaoshuofenlei;
	}
	/**
	 * 设置：读者账号
	 */
	public void setDuzhezhanghao(String duzhezhanghao) {
		this.duzhezhanghao = duzhezhanghao;
	}
	/**
	 * 获取：读者账号
	 */
	public String getDuzhezhanghao() {
		return duzhezhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：小说文件
	 */
	public void setXiaoshuowenjian(String xiaoshuowenjian) {
		this.xiaoshuowenjian = xiaoshuowenjian;
	}
	/**
	 * 获取：小说文件
	 */
	public String getXiaoshuowenjian() {
		return xiaoshuowenjian;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
	/**
	 * 设置：作者账号
	 */
	public void setZuozhezhanghao(String zuozhezhanghao) {
		this.zuozhezhanghao = zuozhezhanghao;
	}
	/**
	 * 获取：作者账号
	 */
	public String getZuozhezhanghao() {
		return zuozhezhanghao;
	}
	/**
	 * 设置：作者姓名
	 */
	public void setZuozhexingming(String zuozhexingming) {
		this.zuozhexingming = zuozhexingming;
	}
	/**
	 * 获取：作者姓名
	 */
	public String getZuozhexingming() {
		return zuozhexingming;
	}

}
