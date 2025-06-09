package com.dao;

import com.entity.XiazaixiaoshuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiazaixiaoshuoVO;
import com.entity.view.XiazaixiaoshuoView;


/**
 * 下载小说
 * 
 * @author 
 * @email 
 * @date 2021-03-07 10:13:34
 */
public interface XiazaixiaoshuoDao extends BaseMapper<XiazaixiaoshuoEntity> {
	
	List<XiazaixiaoshuoVO> selectListVO(@Param("ew") Wrapper<XiazaixiaoshuoEntity> wrapper);
	
	XiazaixiaoshuoVO selectVO(@Param("ew") Wrapper<XiazaixiaoshuoEntity> wrapper);
	
	List<XiazaixiaoshuoView> selectListView(@Param("ew") Wrapper<XiazaixiaoshuoEntity> wrapper);

	List<XiazaixiaoshuoView> selectListView(Pagination page,@Param("ew") Wrapper<XiazaixiaoshuoEntity> wrapper);
	
	XiazaixiaoshuoView selectView(@Param("ew") Wrapper<XiazaixiaoshuoEntity> wrapper);
	
}
