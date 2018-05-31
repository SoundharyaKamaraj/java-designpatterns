/**
 * 
 */
package com.java.programs.examples.classesandobjects;

/**
 * @author Soundharya
 *
 */
public class LocalInnerClassExample {

	static String regularExpression= "[^0-9]";
	
	public static void validatePhoneNumber(String phoneno1,String phoneno2){
		
		//final int numberLength=10;
		
		
		//Valid in JDK 8 and higher
		int numberLength=10;
		class PhoneNumber{
			String formattedNumber=null;
			PhoneNumber(String phoneNumber){
				String currentNumber = phoneNumber.replaceAll(regularExpression,"");
				if(currentNumber.length()==numberLength){
					 formattedNumber =currentNumber;
				}
				else{
					 formattedNumber =null;
				}
			}
			
			public String getPhoneNumber(){
				return formattedNumber;
			}
			 public void printOriginalNumber(){
				 System.out.println("Original phone numbers are"+phoneno1+ " and " +phoneno2);
			 }
		}
		
		PhoneNumber numberOne= new PhoneNumber(phoneno1);
		PhoneNumber numberTwo= new PhoneNumber(phoneno2);
		
		if(numberOne.getPhoneNumber()==null){
			System.out.println("Phone number is null");
		}
		else{
			System.out.println("Formatted number is"+numberOne.getPhoneNumber());
		}
		if(numberTwo.getPhoneNumber()==null){
			System.out.println("Phone number is null");
		}
		else{
			System.out.println("Formatted number is"+numberTwo.getPhoneNumber());
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		validatePhoneNumber("123-987-8762","129-873");

	}

}
