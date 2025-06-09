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


import com.dao.DuzheDao;
import com.entity.DuzheEntity;
import com.service.DuzheService;
import com.entity.vo.DuzheVO;
import com.entity.view.DuzheView;

@Service("duzheService")
public class DuzheServiceImpl extends ServiceImpl<DuzheDao, DuzheEntity> implements DuzheService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DuzheEntity> page = this.selectPage(
                new Query<DuzheEntity>(params).getPage(),
                new EntityWrapper<DuzheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DuzheEntity> wrapper) {
		  Page<DuzheView> page =new Query<DuzheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DuzheVO> selectListVO(Wrapper<DuzheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DuzheVO selectVO(Wrapper<DuzheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DuzheView> selectListView(Wrapper<DuzheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DuzheView selectView(Wrapper<DuzheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
