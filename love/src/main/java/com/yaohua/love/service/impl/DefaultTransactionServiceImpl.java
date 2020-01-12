package com.yaohua.love.service.impl;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

import com.yaohua.love.service.TransactionService;

@Service
public class DefaultTransactionServiceImpl implements TransactionService {

	@Override
	public void doTransaction(PlatformTransactionManager tm,TransactionDefinition td,Runnable callback) {

		TransactionStatus ts = null;
		try {
			ts = tm.getTransaction(td);
			callback.run();
			tm.commit(ts);
		} catch (TransactionException e) {
			tm.rollback(ts);
			e.printStackTrace();
		}
	}
	
}
