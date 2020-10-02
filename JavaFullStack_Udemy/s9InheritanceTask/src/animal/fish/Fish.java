package animal.fish;

import com.task.Animal.Animal;

public class Fish extends Animal{

	protected String liveInWater;
	protected String hasGills;
	
	
	public Fish() {
		animalType = "Fish";
		liveInWater = "Yes";
		hasGills = "Yes";
	}
	
	
	public String showInfo() {
		return "Fish [liveInWater=" + liveInWater + ", hasGills=" + hasGills + ", height=" + height + ", weight="
				+ weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

	
	/*
	public Fish(double height, double weight, String animalType, String bloodType,String liveInWater, String hasGills) {
		super(height,weight,animalType,bloodType);
		this.liveInWater = liveInWater;
		this.hasGills = hasGills;
	}


	public String getLiveInWater() {
		return liveInWater;
	}
	public String getHasGills() {
		return hasGills;
	}
	*/

	
	
}
