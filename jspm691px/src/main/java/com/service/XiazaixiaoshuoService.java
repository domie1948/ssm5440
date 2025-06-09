package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiazaixiaoshuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiazaixiaoshuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiazaixiaoshuoView;


/**
 * 下载小说
 *
 * @author 
 * @email 
 * @date 2021-03-07 10:13:34
 */
public interface XiazaixiaoshuoService extends IService<XiazaixiaoshuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiazaixiaoshuoVO> selectListVO(Wrapper<XiazaixiaoshuoEntity> wrapper);
   	
   	XiazaixiaoshuoVO selectVO(@Param("ew") Wrapper<XiazaixiaoshuoEntity> wrapper);
   	
   	List<XiazaixiaoshuoView> selectListView(Wrapper<XiazaixiaoshuoEntity> wrapper);
   	
   	XiazaixiaoshuoView selectView(@Param("ew") Wrapper<XiazaixiaoshuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiazaixiaoshuoEntity> wrapper);
   	
}

