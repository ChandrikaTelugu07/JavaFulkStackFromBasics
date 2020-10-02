package com.task.Animal;

public class Animal {
	
	protected double height;
	protected double weight;
	protected String animalType;
	protected String bloodType;
	
	
	
	public Animal() {
		
		height = 0;
		weight = 0;
		animalType = "Not Speecified";
		bloodType = "Not Known";
	}



	
	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
	/*
	public Animal(double height, double weight, String animalType, String bloodType) {
		
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String getAnimalType() {
		return animalType;
	}
	public String getBloodType() {
		return bloodType;
	}

*/
	

	

}
