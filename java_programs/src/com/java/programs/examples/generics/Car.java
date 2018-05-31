/**
 * 
 */
package com.java.programs.examples.generics;

import java.util.Optional;

/**
 * @author Soundharya
 * @param <T>
 *
 */
public class Car {
	
	// Immutable fields declared as final
	private final String carType;
	private final String carNumber;
	private final Optional<Integer> year;
	
	// Optional fields are wrapped inside Optional
	private Optional<String> color;
	
	
	private Car(String carType, String carNumber, int year, String color) {
		this.carType = carType;
		this.carNumber = carNumber;
		this.year = Optional.of(year);
		this.color = Optional.ofNullable(color);
	}
	
	/**
	 * @return the color
	 */
	public Optional<String> getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = Optional.of(color);
	}

	/**
	 * @return the carType
	 */
	public String getCarType() {
		return carType;
	}

	/**
	 * @return the carNumber
	 */
	public String getCarNumber() {
		return carNumber;
	}

	/**
	 * @return the year
	 */
	public Optional<Integer> getYear() {
		return year;
	}
	
	public static Builder builder(String carType, String carNumber) {
		return new Builder(carType, carNumber);
	}

	public static class Builder {
		
		private String carType;
		private String carNumber;
		private int year;
		private String color;
		
		private Builder(String carType, String carNumber) {
			this.carType = carType;
			this.carNumber = carNumber;
		}
		
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}
		
		public Builder setYear(int year) {
			this.year = year;
			return this;
		}
		
		public Car build() {
			return new Car(carType, carNumber, year, color);
		}
		
	}

}
