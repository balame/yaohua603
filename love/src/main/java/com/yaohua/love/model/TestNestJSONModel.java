package com.yaohua.love.model;

import lombok.Data;

@Data
public class TestNestJSONModel {
	
	private String id ;
	
	private InnerJSONModel attributes;
	
	@Data
	private class InnerJSONModel {
		private String name;
		private String description;
		
	}

}
