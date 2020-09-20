package s9OopsConcepts;

public class DefaultConstructor2_SmartPhone {
	private String brand = "Samsung";
	
	/*
	// if we are not creating constructor java will automatically inject Default constructor
	
	//if we are adding any other constructor it wont inject default constructor - have to do it by ourselfs
	public DefaultConstructor2_SmartPhone(String brand) {
		this.brand = brand;
	}
	*/


	public String getBrand() {
		return brand;
	}
	
	
	
}
