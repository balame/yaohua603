package com.yaohua.love.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yaohua.love.common.CommonResponse;
import com.yaohua.love.db.TTestDouble;
import com.yaohua.love.db.TTestDoubleMapper;
import com.yaohua.love.model.TTestDoubleModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/testDouble")
@Api(tags = "测试double精度")
public class TTestDoubleController {

	
	@Autowired
	private TTestDoubleMapper tTestDoubleMapper;
	
	@ApiOperation(value = "mybatis 原生映射" ,notes = "mybatis 原生映射")
	@RequestMapping( value = "/getOriginALl" ,method = {RequestMethod.GET})
	public CommonResponse getOriginAllList() {
		List<TTestDouble>  data = tTestDoubleMapper.selectAll();
		CommonResponse response = new CommonResponse();
		
		response.setT(data);
		return response;
	}
	
	@ApiOperation(value = "映射double" ,notes = "映射double")
	@RequestMapping( value = "/getAllListBySelf" ,method = {RequestMethod.GET})
	public CommonResponse getAllListBySelf() {
		List<TTestDoubleModel>  data = tTestDoubleMapper.selectByDoubleList();
		CommonResponse response = new CommonResponse();
		
		response.setT(data);
		return response;
	}
	
}
