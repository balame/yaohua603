package com.yaohua.love.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@Api(tags="测试PathVariable")
@RequestMapping("/PathVariable")
@Slf4j
public class TestPathVariableController {

	@ApiOperation(value = "测试@PathVariable" ,notes = "测试@PathVariable")
	@RequestMapping( value = "/var/{name}/{gender}" ,method = {RequestMethod.GET,RequestMethod.POST})
	public String testPathVariable(@PathVariable String name , @PathVariable String gender) {
		
		log.info(" name = {} , gender = {}",name,gender );
		
		return "success : name = " + name + "  gender = " + gender;
		
	}
}
