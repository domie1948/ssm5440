package com.entity.view;

import com.entity.XiazaixiaoshuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 下载小说
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-07 10:13:34
 */
@TableName("xiazaixiaoshuo")
public class XiazaixiaoshuoView  extends XiazaixiaoshuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiazaixiaoshuoView(){
	}
 
 	public XiazaixiaoshuoView(XiazaixiaoshuoEntity xiazaixiaoshuoEntity){
 	try {
			BeanUtils.copyProperties(this, xiazaixiaoshuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
