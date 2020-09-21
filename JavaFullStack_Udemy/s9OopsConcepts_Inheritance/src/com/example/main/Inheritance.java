package com.example.main;

import com.example.parent.Vehicle;
import com.example.vehicles.Bike;
import com.example.vehicles.Car;
import com.example.vehicles.Truck;

public class Inheritance {

	public static void main(String[] args) {
		
		/*
		Bike bike =	 new Bike();
		
		
		//Using Default Constructors 
		System.out.println(bike.getHandle());
		System.out.println(bike.getEngine());
		*/
		
		/* will execute run() method in bike
		
		Vehicle ve = new Truck();
		ve.run();*/
		Bike bike = new Bike("diesel",2,4,40,"LED","long");
		
		/*
		System.out.println("Handle : " +bike.getHandle());
		System.out.println("Engine : "+bike.getEngine());
		System.out.println("Fuel Tank : "+bike.getFuelTank());
		System.out.println("Seats : "+bike.getSeats());
		System.out.println("Wheels : "+bike.getWheels());
		System.out.println("Lights : " +bike.getLights());*/
		
		// After adding tostring Bike Class
		System.out.println(bike);
		
		/*
		//default contructors
		Car car = new Car();
		System.out.println(car.getEngine());*/
		
		Car car = new Car("diesel",4,6,60,"LED","rotating","playing","on","closed","on");
		/*
		System.out.println(car.getMusicSystem());
		System.out.println(car.getSteering());
		System.out.println(car.getSeats());
		*/
		System.out.println(car);
		
		/*
		//default contructors
		Truck truck = new Truck();
		System.out.println(truck.getMusicSystem());
		System.out.println(truck.getWheels());
		System.out.println(truck.getLights());
		System.out.println(truck.getContainer());*/
		
		
		Truck truck = new Truck("diesel",6,6,60,"LED","rotating","playing","on",50);
		
		/*
		System.out.println(truck.getMusicSystem());
		System.out.println(truck.getWheels());
		System.out.println(truck.getLights());
		System.out.println(truck.getContainer());
		*/
		System.out.println(truck);
		
		
		bike.run();
		
		
	}

}
