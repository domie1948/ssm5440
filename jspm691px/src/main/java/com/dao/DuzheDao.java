package com.dao;

import com.entity.DuzheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DuzheVO;
import com.entity.view.DuzheView;


/**
 * 读者
 * 
 * @author 
 * @email 
 * @date 2021-03-07 10:13:33
 */
public interface DuzheDao extends BaseMapper<DuzheEntity> {
	
	List<DuzheVO> selectListVO(@Param("ew") Wrapper<DuzheEntity> wrapper);
	
	DuzheVO selectVO(@Param("ew") Wrapper<DuzheEntity> wrapper);
	
	List<DuzheView> selectListView(@Param("ew") Wrapper<DuzheEntity> wrapper);

	List<DuzheView> selectListView(Pagination page,@Param("ew") Wrapper<DuzheEntity> wrapper);
	
	DuzheView selectView(@Param("ew") Wrapper<DuzheEntity> wrapper);
	
}
