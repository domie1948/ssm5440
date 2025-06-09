package com.entity.model;

import com.entity.GoumaixiaoshuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 购买小说
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-07 10:13:33
 */
public class GoumaixiaoshuoModel  implements Serializable {
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
	 * 作者账号
	 */
	
	private String zuozhezhanghao;
		
	/**
	 * 作者姓名
	 */
	
	private String zuozhexingming;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 购买日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goumairiqi;
		
	/**
	 * 读者账号
	 */
	
	private String duzhezhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：购买日期
	 */
	 
	public void setGoumairiqi(Date goumairiqi) {
		this.goumairiqi = goumairiqi;
	}
	
	/**
	 * 获取：购买日期
	 */
	public Date getGoumairiqi() {
		return goumairiqi;
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
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
