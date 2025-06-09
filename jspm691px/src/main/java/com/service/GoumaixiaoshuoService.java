package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaixiaoshuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaixiaoshuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaixiaoshuoView;


/**
 * 购买小说
 *
 * @author 
 * @email 
 * @date 2021-03-07 10:13:33
 */
public interface GoumaixiaoshuoService extends IService<GoumaixiaoshuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaixiaoshuoVO> selectListVO(Wrapper<GoumaixiaoshuoEntity> wrapper);
   	
   	GoumaixiaoshuoVO selectVO(@Param("ew") Wrapper<GoumaixiaoshuoEntity> wrapper);
   	
   	List<GoumaixiaoshuoView> selectListView(Wrapper<GoumaixiaoshuoEntity> wrapper);
   	
   	GoumaixiaoshuoView selectView(@Param("ew") Wrapper<GoumaixiaoshuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaixiaoshuoEntity> wrapper);
   	
}

