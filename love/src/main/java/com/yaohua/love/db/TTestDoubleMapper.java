package com.yaohua.love.db;

import java.util.List;

import com.yaohua.love.model.TTestDoubleModel;

import tk.mybatis.mapper.common.Mapper;

public interface TTestDoubleMapper extends Mapper<TTestDouble> {
	
	List<TTestDoubleModel> selectByDoubleList();
}