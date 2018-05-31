/**
 * 
 */
package com.java.programs.examples.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Soundharya
 *
 */
public class TypeInterferanceGenericExamples {
	
	//Type inference and Raw type Example
	
	public static<U> void addToGarage(U u, List<Vehicles<U>> vehicleList){
		
		Vehicles<U> newVehicle = new Vehicles<>();
		newVehicle.setT(u);
		vehicleList.add(newVehicle);
	}

	public static <U> void printVehiclesInGarage(List<Vehicles<U>> vehicleList) {
		int counter = 0;
		for (Vehicles<U> vehicleDetails : vehicleList) {
			if (vehicleDetails.getT() instanceof Car) {
				System.out.println(
						"counter: " + counter + " of Vehicle Number #" + 
				((Car)vehicleDetails.getT()).getCarNumber());
				counter++;
			} else {
				System.err.println("Not car instance");
			}
		}

	}
	
	public static void main(String[] args) {
	   
		ArrayList<Vehicles<Car>> listOfVehicles =
	      new ArrayList<>();
	    
		//Adding a String to a list using generics
		/*GenericExamples.<String>addToGarage(String.valueOf("Car"), listOfVehicles);
	    GenericExamples.addToGarage(String.valueOf("Bike"), listOfVehicles);
	    GenericExamples.addToGarage(String.valueOf("Truck"), listOfVehicles);
	    GenericExamples.printVehiclesInGarage(listOfVehicles);*/
	    	    
	    /*Car.Builder builder = new Car.Builder("Civic", "XYZ");
	    
	    builder.setColor("Black");
	    
	    builder.setYear(2006);
	    
	    Car car = builder.build();*/
	    
	    Car car = Car.builder("Civic", "XYZ123")
	    .setColor("Black")
	    .setYear(2006)
	    .build();
	    Car carTwo = Car.builder("Accord", "TUV123")
	    	    .setColor("Grey")
	    	    .setYear(2007)
	    	    .build();
	    carTwo.setColor("White");
	    TypeInterferanceGenericExamples.<Car>addToGarage(car, listOfVehicles);
	    TypeInterferanceGenericExamples.addToGarage(carTwo, listOfVehicles);
	    TypeInterferanceGenericExamples.printVehiclesInGarage(listOfVehicles);
	    
	  }
	
}
