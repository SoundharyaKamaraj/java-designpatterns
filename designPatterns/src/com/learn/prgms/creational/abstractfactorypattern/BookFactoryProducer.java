/**
 * 
 */
package com.learn.prgms.creational.abstractfactorypattern;

/**
 * @author Soundharya
 *
 */
public class BookFactoryProducer {
	
	public static BookFactory getBookCategories(String bookType){
		
		if(bookType.equals("TECHNICAL")){
			return new TechnicalBookFactory();
		}
		else{
			return new NonTechBookFactory();
		}
		
	}

}
