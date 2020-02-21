package com.yaohua.love.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "retrofit2")
@RequestMapping("/retrofit2")
public class Retrofit2Controller {
	
	 @ApiOperation(value = "retrofit2 请求" ,notes = "retrofit2 请求")
	 @ResponseBody
	 @RequestMapping("/request")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType="query", name = "id", value = "id"),
        @ApiImplicitParam(paramType="query", name = "value", value = "value"),
    })
     public  String request(String id , String value ) {
    	 JSONObject jsonObject = new JSONObject();
    	 
    	 return jsonObject.toJSONString();
		 
     }

}
