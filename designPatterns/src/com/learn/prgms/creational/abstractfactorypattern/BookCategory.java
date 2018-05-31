/**
 * 
 */
package com.learn.prgms.creational.abstractfactorypattern;

/**
 * @author Soundharya
 *
 */
public enum BookCategory {
	
	TECHNICAL("TECHNICAL"){
        @Override
        public BookFactory getBookCategories(String bookCategory) {
            return new TechnicalBookFactory();
        }
    },  
    NONTECH("NONTECH"){
        @Override
        public BookFactory getBookCategories(String bookCategory) {
            return new NonTechBookFactory();
        }
    }; 
	
	public abstract BookFactory getBookCategories(String bookType);

	public String bookCategory;
	
	private BookCategory(String category) {
		this.bookCategory =category;
	}
}
