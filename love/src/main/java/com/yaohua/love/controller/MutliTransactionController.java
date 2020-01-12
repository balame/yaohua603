package com.yaohua.love.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yaohua.love.common.CommonResponse;
import com.yaohua.love.service.MutliTransactionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "Spring 事务测试")
@RestController
@RequestMapping("/mutliTransaction")
public class MutliTransactionController {
	
	@Autowired
	private MutliTransactionService mutliService;
	
    @ApiOperation(value="事务传播测试", notes="事务传播测试")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType="query", name = "loop", value = "循环数"),
        @ApiImplicitParam(paramType="query", name = "listsize", value = "list大小"),
    })
	@RequestMapping(value = "/insert",method = RequestMethod.GET)
	public CommonResponse mutli(int loop,int listsize) {
		CommonResponse response = new CommonResponse();
		try {
			mutliService.testSerializerListTransaction(loop, listsize);
		} catch (Exception e) {
			response.setMessage("失败");
			response.setCode(-1);
			e.printStackTrace();
		}
		return response;
	}

}
