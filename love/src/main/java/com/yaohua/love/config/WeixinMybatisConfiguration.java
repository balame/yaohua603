package com.yaohua.love.config;

import java.io.IOException;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tk.mybatis.spring.annotation.MapperScan;


@Configuration
@EnableTransactionManagement
@ConditionalOnClass({EntityManager.class})
@MapperScan(basePackages = {"tk.mybatis.mapper.common.Mapper","com.yaohua.love.db"} ,sqlSessionTemplateRef = "WeixinSqlSessionTemplate")
public class WeixinMybatisConfiguration {
	
	
	@Resource
	private DataSource dataSource;
	
	@Bean("weixinSqlSessionFactory")
	public SqlSessionFactory weixinSqlSessionFactory() {
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		try {
			sessionFactory.setDataSource(dataSource);
			sessionFactory.setTypeAliasesPackage("com.yaohua.love.db");
			sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/mapper/*Mapper.xml"));
			sessionFactory.setConfigLocation(new DefaultResourceLoader().getResource("mybatis/mybatis-config.xml"));
			return sessionFactory.getObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Bean("WeixinSqlSessionTemplate")
	public SqlSessionTemplate weixinSqlSessionTemplate(@Qualifier("weixinSqlSessionFactory")SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	@Bean("weixinTx")
	public PlatformTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource);
	}

}
