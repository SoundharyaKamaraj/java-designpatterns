/**
 * 
 */
package com.learn.prgms.creational.singletondesignpattern;

import org.apache.log4j.Logger;

/**
 * @author Soundharya
 *
 */
public class MultiThreadSingletonExample {

	
	private static MultiThreadSingletonExample instance = null;
	private static boolean trackThread = true;
	private static Logger logger = Logger.getRootLogger();
	
	private MultiThreadSingletonExample(){
		
	}
	
	public static MultiThreadSingletonExample getInstance(){
		
		if(instance == null){
			simulateActivity();
			 instance = new MultiThreadSingletonExample();
		}
		return instance;
	}

	private static void simulateActivity() {
		
		if(trackThread){
			trackThread =false;
			logger.info("Putting the first thread to sleep");
			try {
				Thread.currentThread().sleep(50);
			} catch (InterruptedException e) {
				logger.warn("Thread interrupted");
				e.printStackTrace();
			}
			
		}
	}
	
}
