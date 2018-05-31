/**
 * 
 */
package com.learn.prgms.creational.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Soundharya
 *
 */
public class BuilderPatternExample {
	public static <U> void addToGarage(U u, List<Vehicles<U>> vehicleList) {

		Vehicles<U> newVehicle = new Vehicles<>();
		newVehicle.setT(u);
		vehicleList.add(newVehicle);
	}

	public static <U> void printVehiclesInGarage(List<Vehicles<U>> vehicleList) {
		int counter = 0;
		for (Vehicles<U> vehicleDetails : vehicleList) {
			System.out.println("counter: " + counter + " of Vehicle type #" + vehicleDetails.getT().toString());
			counter++;
		}
	}

	public static void main(String[] args) {

		ArrayList<Vehicles<Car>> listOfVehicles = new ArrayList<>();
		Car carOne = Car.builder("Civic", "XYZ123").setColor("Black").setYear(2006).build();
		BuilderPatternExample.<Car>addToGarage(carOne, listOfVehicles);
		BuilderPatternExample.addToGarage(carOne, listOfVehicles);

	}

}
