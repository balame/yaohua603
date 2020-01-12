package com.yaohua.love.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.alibaba.druid.support.logging.Log;
import com.yaohua.love.db.TCustomer;
import com.yaohua.love.db.TCustomerMapper;
import com.yaohua.love.db.TUser;
import com.yaohua.love.db.TUserMapper;
import com.yaohua.love.service.CommonDBOperaService;
import com.yaohua.love.service.MutliTransactionService;
import com.yaohua.love.service.TransactionService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class MutliTransactionServiceImpl implements MutliTransactionService{
	
	
	@Autowired
	private CommonDBOperaService<TUser> dbOperaService;
	
	@Autowired
	private TransactionService transaction;
	
	
	@Override
	public void testSerializerListTransaction(int loop,int listsize) {
		log.info(" loop = {} , listsize = {}",loop,listsize );
		TransactionDefinition td = new DefaultTransactionDefinition();
		for(int i = 0 ; i< loop ; i++) {
			List<TUser> users = createUsers(listsize);
			transaction.doTransaction(tm, td, new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					dbOperaService.insertEntitys(users);
				}				
			});
		}
		
	}

	@Autowired
	private TCustomerMapper tCustomerMapper;
	
	@Autowired
	private TUserMapper tUserMapper;
	
	@Autowired
	private PlatformTransactionManager tm;
	
	
	private List<TUser> createUsers(int size){
		List<TUser> list = new ArrayList<>();
		for(int i=0 ;i<size ;i++) {
			TUser user = new TUser();
			user.setCreaterId(0l);
			user.setCreateTime(new Date());
			user.setEmail("test.transaction.paga");
			user.setName("lovelaugh");
			user.setStatus("2");
			user.setTel("17798920983");
			user.setSid("2ii8823");
			user.setPassword("9eewjej2");
			list.add(user);
		}
		return list;
	}
	
	
	private List<TCustomer> createCustomers(int listsize){
		List<TCustomer> list = new ArrayList<>();
		
		for(int i = 0 ; i<listsize ; i++) {
			TCustomer customer = new TCustomer();
			customer.setCreateTime(new Date());
			customer.setCreaterId(0L);
			customer.setUpdateTime(new Date());
			customer.setUpdaterId(0L);
			customer.setSidFlag("haha");
			customer.setTelFlag("hihi");
			customer.setEmailFlag("ddd");
			customer.setName("开心小宝贝");
			customer.setUserId(78L);
			list.add(customer);
		}
		return list;
	}
	
	
	private void insertUsersByTransaction(List<TUser> list) {
		TransactionStatus ts = tm.getTransaction(null);
		
		try {
			
			for(int i=0;i<list.size();i++) {
				tUserMapper.insert(list.get(i));

			}
			
			tm.commit(ts);
		} catch (TransactionException e) {
			tm.rollback(ts);
			e.printStackTrace();
		}
	}
	
	private void insertCustomersByTransaction(List<TCustomer> list) {
		TransactionStatus ts = tm.getTransaction(null);
		
		try {
			list.stream().forEach( x -> {
				System.out.println(x);
				tCustomerMapper.insert(x);
			});
			tm.commit(ts);
		} catch (TransactionException e) {
			tm.rollback(ts);
			e.printStackTrace();
		}
	}

}
