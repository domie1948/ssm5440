package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DuzheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DuzheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DuzheView;


/**
 * 读者
 *
 * @author 
 * @email 
 * @date 2021-03-07 10:13:33
 */
public interface DuzheService extends IService<DuzheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DuzheVO> selectListVO(Wrapper<DuzheEntity> wrapper);
   	
   	DuzheVO selectVO(@Param("ew") Wrapper<DuzheEntity> wrapper);
   	
   	List<DuzheView> selectListView(Wrapper<DuzheEntity> wrapper);
   	
   	DuzheView selectView(@Param("ew") Wrapper<DuzheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DuzheEntity> wrapper);
   	
}

