package com.yaohua.love.service;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;

public interface TransactionService {

	public void doTransaction(PlatformTransactionManager tm,TransactionDefinition td,Runnable callback);
}
