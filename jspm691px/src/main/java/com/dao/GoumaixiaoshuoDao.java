package com.dao;

import com.entity.GoumaixiaoshuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoumaixiaoshuoVO;
import com.entity.view.GoumaixiaoshuoView;


/**
 * 购买小说
 * 
 * @author 
 * @email 
 * @date 2021-03-07 10:13:33
 */
public interface GoumaixiaoshuoDao extends BaseMapper<GoumaixiaoshuoEntity> {
	
	List<GoumaixiaoshuoVO> selectListVO(@Param("ew") Wrapper<GoumaixiaoshuoEntity> wrapper);
	
	GoumaixiaoshuoVO selectVO(@Param("ew") Wrapper<GoumaixiaoshuoEntity> wrapper);
	
	List<GoumaixiaoshuoView> selectListView(@Param("ew") Wrapper<GoumaixiaoshuoEntity> wrapper);

	List<GoumaixiaoshuoView> selectListView(Pagination page,@Param("ew") Wrapper<GoumaixiaoshuoEntity> wrapper);
	
	GoumaixiaoshuoView selectView(@Param("ew") Wrapper<GoumaixiaoshuoEntity> wrapper);
	
}
