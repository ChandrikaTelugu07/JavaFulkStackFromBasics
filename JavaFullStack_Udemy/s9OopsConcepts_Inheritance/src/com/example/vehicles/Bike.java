package com.example.vehicles;

import com.example.parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;

	public Bike() {
		super();
		handle = "short";
	}
	/*
	public Bike(String handle) {
		super();
		this.handle = handle;
	}
	*/
	//To call parametarized constructor of parent class
	
	
	public Bike(String engine, int wheels, int seats, int fuelTank, String lights,String handle) {
		super(engine,wheels,seats,fuelTank,lights);
		this.handle = handle;
	}
	
	public String getHandle() {
		return handle;
	}


	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}
	
	public void run() {
		System.out.println("Running Bike");
		System.out.println(toString());
	}
	
	
	
}
