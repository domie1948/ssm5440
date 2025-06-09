package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GoumaixiaoshuoEntity;
import com.entity.view.GoumaixiaoshuoView;

import com.service.GoumaixiaoshuoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 购买小说
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-07 10:13:33
 */
@RestController
@RequestMapping("/goumaixiaoshuo")
public class GoumaixiaoshuoController {
    @Autowired
    private GoumaixiaoshuoService goumaixiaoshuoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GoumaixiaoshuoEntity goumaixiaoshuo, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zuozhe")) {
			goumaixiaoshuo.setZuozhezhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("duzhe")) {
			goumaixiaoshuo.setDuzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GoumaixiaoshuoEntity> ew = new EntityWrapper<GoumaixiaoshuoEntity>();
    	PageUtils page = goumaixiaoshuoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, goumaixiaoshuo), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GoumaixiaoshuoEntity goumaixiaoshuo, HttpServletRequest request){
        EntityWrapper<GoumaixiaoshuoEntity> ew = new EntityWrapper<GoumaixiaoshuoEntity>();
    	PageUtils page = goumaixiaoshuoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, goumaixiaoshuo), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GoumaixiaoshuoEntity goumaixiaoshuo){
       	EntityWrapper<GoumaixiaoshuoEntity> ew = new EntityWrapper<GoumaixiaoshuoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( goumaixiaoshuo, "goumaixiaoshuo")); 
        return R.ok().put("data", goumaixiaoshuoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GoumaixiaoshuoEntity goumaixiaoshuo){
        EntityWrapper< GoumaixiaoshuoEntity> ew = new EntityWrapper< GoumaixiaoshuoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( goumaixiaoshuo, "goumaixiaoshuo")); 
		GoumaixiaoshuoView goumaixiaoshuoView =  goumaixiaoshuoService.selectView(ew);
		return R.ok("查询购买小说成功").put("data", goumaixiaoshuoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GoumaixiaoshuoEntity goumaixiaoshuo = goumaixiaoshuoService.selectById(id);
        return R.ok().put("data", goumaixiaoshuo);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GoumaixiaoshuoEntity goumaixiaoshuo = goumaixiaoshuoService.selectById(id);
        return R.ok().put("data", goumaixiaoshuo);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GoumaixiaoshuoEntity goumaixiaoshuo, HttpServletRequest request){
    	goumaixiaoshuo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(goumaixiaoshuo);

        goumaixiaoshuoService.insert(goumaixiaoshuo);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GoumaixiaoshuoEntity goumaixiaoshuo, HttpServletRequest request){
    	goumaixiaoshuo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(goumaixiaoshuo);

        goumaixiaoshuoService.insert(goumaixiaoshuo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GoumaixiaoshuoEntity goumaixiaoshuo, HttpServletRequest request){
        //ValidatorUtils.validateEntity(goumaixiaoshuo);
        goumaixiaoshuoService.updateById(goumaixiaoshuo);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        goumaixiaoshuoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GoumaixiaoshuoEntity> wrapper = new EntityWrapper<GoumaixiaoshuoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zuozhe")) {
			wrapper.eq("zuozhezhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("duzhe")) {
			wrapper.eq("duzhezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = goumaixiaoshuoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
