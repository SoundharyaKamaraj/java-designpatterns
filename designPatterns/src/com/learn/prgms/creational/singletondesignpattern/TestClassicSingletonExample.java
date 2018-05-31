/**
 * 
 */
package com.learn.prgms.creational.singletondesignpattern;
import org.apache.log4j.Logger;
import org.junit.Assert;
import junit.framework.TestCase;
/**
 * @author Soundharya
 *
 */
public class TestClassicSingletonExample extends TestCase{

	private ClassicSingletonExample objectOne=null, objectTwo =null;
	
	private static Logger logger = Logger.getRootLogger();
	
	public TestClassicSingletonExample(String name){
		super(name);
	}
	
	public void setUp(){
		objectOne = ClassicSingletonExample.getInstance();
		logger.info("objectOne:"+objectOne);
		objectTwo = ClassicSingletonExample.getInstance();
	}
	
	public void testUnique(){
		logger.info("checking singletons for equality" + objectOne.hashCode() +"="+objectTwo.hashCode() );
		Assert.assertEquals(objectOne, objectTwo);
	}
}
