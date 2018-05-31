/**
 * 
 */
package com.learn.prgms.creational.factorypatterns;

/**
 * @author Soundharya
 *
 */
public enum BookType {
  
	
	JAVA("JAVA"){
		@Override
		public Books getBookCategories(){
			return new JAVABooks();
		}
	},
	HTML("HTML"){
		@Override
		public Books getBookCategories(){
			return new HTMLBooks();
		}
		
	},
	OTHERS("OTHERS"){
		@Override
		public Books getBookCategories(){
			return new OtherBooks();
	}
	};
	
	private BookType(String bookType){
		this.bookType = bookType;
	}
	 private String bookType;	
	
	public abstract Books getBookCategories();
	
	
	/**
	 * @return the bookType
	 */
	
	public String getBookType() {
		return bookType;
	}

	
	
	@Override
	public String toString() 
	{
	return "TYPE CODE -> "+bookType;
	}
	
}
