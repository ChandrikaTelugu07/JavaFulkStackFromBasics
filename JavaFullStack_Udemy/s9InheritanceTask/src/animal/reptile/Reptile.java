package animal.reptile;

import com.task.Animal.Animal;

public class Reptile extends Animal{
	
	protected String drySkin;
	protected String backBone;
	protected String softShelledEggs;
	
	
	public Reptile() {
		height = 5.0;
		weight = 98;
		animalType = "Reptile";
		bloodType = "cold";
		drySkin = "Dry Skin";
		backBone = "yes";
		softShelledEggs = "soft";
	}


	public String showInfo() {
		return "Reptile [drySkin=" + drySkin + ", backBone=" + backBone + ", softShelledEggs=" + softShelledEggs
				+ ", height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
	/*
	public Reptile(double height, double weight, String animalType, String bloodType,String drySkin, String backBone, String softShelledEggs) {
		super(height,weight,animalType,bloodType);
		this.drySkin = drySkin;
		this.backBone = backBone;
		this.softShelledEggs = softShelledEggs;
	}


	public String getDrySkin() {
		return drySkin;
	}
	public String getBackBone() {
		return backBone;
	}
	public String getsoftShelledEggs() {
		return softShelledEggs;
	}


	*/

	
}
