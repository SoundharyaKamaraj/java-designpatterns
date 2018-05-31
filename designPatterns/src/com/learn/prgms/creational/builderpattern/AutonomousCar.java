/**
 * 
 */
package com.learn.prgms.creational.builderpattern;

import java.util.Optional;

/**
 * @author Soundharya
 *
 */
public  class AutonomousCar extends Car {
	
			
		public AutonomousCar(String softwareName,String carType, String carNumber, int year, String color){
			
			//Car car= new Car(carType,carNumber,year,color);
			super(carType,carNumber,year,color);
			//this.softwareName =softwareName;
			//super("dfd");
			super.builder(carType, carNumber);
		//	super(carType,carNumber,year,color).builder(carType, carNumber);
			//super.builder(carType, carNumber);
			//Car.builder(carType, carNumber);
			
		}
		
		public void draw(String i){
			
		}
public void draw(int i){
			
		}
public void draw(float i){
	
}
			
			
			
			
	
}
