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


import com.dao.XiazaixiaoshuoDao;
import com.entity.XiazaixiaoshuoEntity;
import com.service.XiazaixiaoshuoService;
import com.entity.vo.XiazaixiaoshuoVO;
import com.entity.view.XiazaixiaoshuoView;

@Service("xiazaixiaoshuoService")
public class XiazaixiaoshuoServiceImpl extends ServiceImpl<XiazaixiaoshuoDao, XiazaixiaoshuoEntity> implements XiazaixiaoshuoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiazaixiaoshuoEntity> page = this.selectPage(
                new Query<XiazaixiaoshuoEntity>(params).getPage(),
                new EntityWrapper<XiazaixiaoshuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiazaixiaoshuoEntity> wrapper) {
		  Page<XiazaixiaoshuoView> page =new Query<XiazaixiaoshuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiazaixiaoshuoVO> selectListVO(Wrapper<XiazaixiaoshuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiazaixiaoshuoVO selectVO(Wrapper<XiazaixiaoshuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiazaixiaoshuoView> selectListView(Wrapper<XiazaixiaoshuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiazaixiaoshuoView selectView(Wrapper<XiazaixiaoshuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
