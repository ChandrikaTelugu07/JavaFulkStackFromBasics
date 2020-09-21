package com.example.vehicles;

import com.example.parent.Vehicle;

public class Car extends Vehicle{
	
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertaimentSystem;
	public Car() {
		super();
		steering = "rotating";
		musicSystem = "playing";
		airConditioner = "on";
		fridge = "closed";
		entertaimentSystem = "on";
		
	}
	
	public Car(String engine, int wheels, int seats, int fuelTank, String lights,String steering
			, String musicSystem, String airConditioner, String fridge
			, String entertaimentSystem) {
		super(engine,wheels,seats,fuelTank,lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertaimentSystem = entertaimentSystem;
	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public String getFridge() {
		return fridge;
	}

	public String getEntertaimentSystem() {
		return entertaimentSystem;
	}

	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertaimentSystem()=" + getEntertaimentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + "]";
	}
	
	
	
	
	
}
