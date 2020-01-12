package com.yaohua.love;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadPoolTest {
	
	private final static Logger log = LoggerFactory.getLogger(ThreadPoolTest.class);


	public static void main(String[] args) {
			log.info("test log ");
			

			
			
			BlockingQueue queue = createQueue();
			ExecutorService executors = new ThreadPoolExecutor(2,4,1,TimeUnit.SECONDS,queue,new RejectedExecutionHandler() {

				@Override
				public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
					log.info(" handle rejected execution");
					Thread thread = new Thread(r);
					thread.start();
				}
				
			});
			
			
			
			try {
				for(int i =0 ;i<100;i++) {
					int number = i;
					executors.execute( () -> {
						log.info(" mock thread execute " + number);
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					});
				}
			} 
			
			
			 catch (Exception e) {
				log.error(" execute error",e);
			} finally {
				try {
					if(!executors.isShutdown()) {
						executors.shutdown();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	}
	
	public static BlockingQueue createQueue() {
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue(20);
		/*queue.add(() -> {
			log.info("i am blockingqueue task1");
		});
		queue.add(() -> {
			log.info("i am blockingqueue task2");
		});
		queue.add(() -> {
			log.info("i am blockingqueue task3");
		});
		queue.add(() -> {
			log.info("i am blockingqueue task4");
		});
		queue.add(() -> {
			log.info("i am blockingqueue task5");
		});
		queue.add(() -> {
			log.info("i am blockingqueue task6");
		});
		queue.add(() -> {
			log.info("i am blockingqueue task7");
		});
		queue.add(() -> {
			log.info("i am blockingqueue task8");
		});
		queue.add(() -> {
			log.info("i am blockingqueue task9");
		});*/
		return queue;
	}

}
