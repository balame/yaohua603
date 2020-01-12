package com.yaohua.love.util;

import java.util.UUID;

import tk.mybatis.mapper.genid.GenId;

public class UUIdGenId implements GenId<String>{

	@Override
	public String genId(String table, String column) {
		// TODO Auto-generated method stub
		 return UUID.randomUUID().toString().replace("-","");
	}

}
