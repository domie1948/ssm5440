package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GoumaixiaoshuoDao;
import com.entity.GoumaixiaoshuoEntity;
import com.service.GoumaixiaoshuoService;
import com.entity.vo.GoumaixiaoshuoVO;
import com.entity.view.GoumaixiaoshuoView;

@Service("goumaixiaoshuoService")
public class GoumaixiaoshuoServiceImpl extends ServiceImpl<GoumaixiaoshuoDao, GoumaixiaoshuoEntity> implements GoumaixiaoshuoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaixiaoshuoEntity> page = this.selectPage(
                new Query<GoumaixiaoshuoEntity>(params).getPage(),
                new EntityWrapper<GoumaixiaoshuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaixiaoshuoEntity> wrapper) {
		  Page<GoumaixiaoshuoView> page =new Query<GoumaixiaoshuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaixiaoshuoVO> selectListVO(Wrapper<GoumaixiaoshuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaixiaoshuoVO selectVO(Wrapper<GoumaixiaoshuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaixiaoshuoView> selectListView(Wrapper<GoumaixiaoshuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaixiaoshuoView selectView(Wrapper<GoumaixiaoshuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
