package com.yaohua.love.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.common.Mapper;

public class CommonDBOperaService<T> {
	
//	@Autowired
	Mapper<T> mapper;

	
	public int insertEntity(T t) {
		return mapper.insertSelective(t);
	}

	
	public int insertEntitys(List<T> t) {
		t.stream().forEach( x -> {
			mapper.insertSelective(x);
		});
		return t.size();
	}

}
