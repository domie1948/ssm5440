package com.entity.vo;

import com.entity.XiazaixiaoshuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 下载小说
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-07 10:13:34
 */
public class XiazaixiaoshuoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
