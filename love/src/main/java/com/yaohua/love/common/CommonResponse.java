package com.yaohua.love.common;

import lombok.Data;

@Data
public class CommonResponse<T> {
	
	private int code = 0;
	private String message = "成功";
	private T t;
	
}
