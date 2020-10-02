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


	
	public String showInfo() {
		return "Birds [animalsWithfeathers=" + animalsWithfeathers + ", canFly=" + canFly + ", height=" + height
				+ ", weight=" + weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	

	
	
}
