package com.yaohua.love.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.fastjson.JSON;
import com.yaohua.love.common.CommonResponse;
import com.yaohua.love.db.TUser;
import com.yaohua.love.db.TUserMapper;
import com.yaohua.love.model.SimpleJSONModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Api(value="用户")
@Slf4j
public class UserController {
	
	@Autowired
	TUserMapper userMapper;

	
    @ApiOperation(value="用户录入", notes="用户录入")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType="query", name = "name", value = "名字"),
        @ApiImplicitParam(paramType="query", name = "type", value = "测试json转换"),
    })
	@RequestMapping(value = "/insert",method = {RequestMethod.GET,RequestMethod.POST})
	public CommonResponse mutli(TUser user) {
		CommonResponse response = new CommonResponse();
		try {
			userMapper.insert(user);
		} catch (Exception e) {
			response.setMessage("失败");
			response.setCode(-1);
			e.printStackTrace();
		}
		return response;
	}
    
    @ApiOperation(value="获取数据json转对象", notes="获取数据json转对象")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType="query", name = "id", value = "id"),
    })
	@RequestMapping(value = "/getandjson",method = {RequestMethod.POST,RequestMethod.GET})
	public CommonResponse getAndTransferJSON(TUser user) {
		CommonResponse response = new CommonResponse();
		try {
			TUser data = userMapper.selectByPrimaryKey(user);
			String type = data.getType();
			System.out.println(" type = " + type);
			
		//	String afterUnescape = 	StringEscapeUtils.unescapeJava(type);
			SimpleJSONModel simpleJson = JSON.parseObject(type, SimpleJSONModel.class);
			System.out.println(JSON.toJSONString(simpleJson));
		} catch (Exception e) {
			response.setMessage("失败");
			response.setCode(-1);
			e.printStackTrace();
		}
		return response;
	}
    
}
