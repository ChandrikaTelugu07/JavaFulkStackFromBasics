package com.example.vehicles;

import com.example.parent.Vehicle;

public class Truck extends Vehicle{
	
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private int container;
	
	public Truck() {
		super();
		steering = "roatting";
		musicSystem = "playing";
		airConditioner = "on";
		container = 30;
	}

	public Truck(String engine, int wheels, int seats, int fuelTank, String lights,String steering, String musicSystem, String airConditioner, int container) {
		super(engine,wheels,seats,fuelTank,lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
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

	public int getContainer() {
		return container;
	}

	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + "]";
	}
	
	
	public void run() {
		System.out.println("Running Truck");
	}

}
