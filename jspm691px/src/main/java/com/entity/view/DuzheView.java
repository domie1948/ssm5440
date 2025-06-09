package com.entity.view;

import com.entity.DuzheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 读者
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-07 10:13:33
 */
@TableName("duzhe")
public class DuzheView  extends DuzheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DuzheView(){
	}
 
 	public DuzheView(DuzheEntity duzheEntity){
 	try {
			BeanUtils.copyProperties(this, duzheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
