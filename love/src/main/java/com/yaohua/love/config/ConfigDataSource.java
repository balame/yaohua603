package com.yaohua.love.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class ConfigDataSource {
	
	
	@Autowired
	DataSourceProperties db;
	
	
	@Bean("dataSource")
	public DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(db.getUrl());
        datasource.setUsername(db.getUsername());
        datasource.setPassword(db.getPassword());
        datasource.setDriverClassName(db.getDriverClassName());
        datasource.setInitialSize(db.getInitialSize());
        datasource.setMinIdle(db.getMinIdle());
        datasource.setMaxActive(db.getMaxActive());
        datasource.setMaxWait(db.getMaxWait());
        datasource.setTimeBetweenEvictionRunsMillis(db.getTimeBetweenEvictionRunsMillis());
        datasource.setMinEvictableIdleTimeMillis(db.getMinEvictableIdleTimeMillis());
        datasource.setValidationQuery(db.getValidationQuery());
        datasource.setTestOnReturn(db.isTestOnReturn());
        datasource.setPoolPreparedStatements(db.isPoolPreparedStatements());
        datasource.setMaxPoolPreparedStatementPerConnectionSize(db.getMaxPoolPreparedStatementPerConnectionSize());
        datasource.setUseGlobalDataSourceStat(db.isUseGlobalDataSourceStat());
		return datasource;
	}

}
