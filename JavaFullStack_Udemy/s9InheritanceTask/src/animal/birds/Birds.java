package animal.birds;

import com.task.Animal.Animal;

public class Birds extends Animal{

	protected String animalsWithfeathers;
	protected String canFly;
	
	
	public Birds() {
		height = 5.0;
		weight = 98;
		animalType = "Reptile";
		bloodType = "cold";
		animalsWithfeathers = "Yes";
		canFly = "Yes";
		
	}
	
	
	public Birds(double height, double weight, String animalType, String bloodType,String animalsWithfeathers, String canFly) {
		super(height,weight,animalType,bloodType);
		this.animalsWithfeathers = animalsWithfeathers;
		this.canFly = canFly;
	}


	public String getAnimalsWithfeathers() {
		return animalsWithfeathers;
	}
	public String getCanFly() {
		return canFly;
	}


	@Override
	public String toString() {
		return "Birds [getAnimalsWithfeathers()=" + getAnimalsWithfeathers() + ", getCanFly()=" + getCanFly()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
	
}
