package com.entity.vo;

import com.entity.XiaoshuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 小说信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-07 10:13:33
 */
public class XiaoshuoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 小说分类
	 */
	
	private String xiaoshuofenlei;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 字数
	 */
	
	private Integer zishu;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 小说封面
	 */
	
	private String xiaoshuofengmian;
		
	/**
	 * 作者账号
	 */
	
	private String zuozhezhanghao;
		
	/**
	 * 作者姓名
	 */
	
	private String zuozhexingming;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：字数
	 */
	 
	public void setZishu(Integer zishu) {
		this.zishu = zishu;
	}
	
	/**
	 * 获取：字数
	 */
	public Integer getZishu() {
		return zishu;
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
	 * 设置：小说封面
	 */
	 
	public void setXiaoshuofengmian(String xiaoshuofengmian) {
		this.xiaoshuofengmian = xiaoshuofengmian;
	}
	
	/**
	 * 获取：小说封面
	 */
	public String getXiaoshuofengmian() {
		return xiaoshuofengmian;
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
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
