package s9OopsConcepts;

public class ClassesGetterSetter1 {

	public static void main(String[] args) {
		
		ClassesGetterSettr1Car  car = new ClassesGetterSettr1Car();
		
		ClassesGetterSettr1Car  car1 = new ClassesGetterSettr1Car("closed", "on", "seated",10);
		/*
		car.setSpeed(10);
		System.out.println(car.getSpeed());
		
		car.setDoors("Closed");
		System.out.println(car.getDoors());
		*/
		/*
		car.setDriver("seated");
		car.setEngine("on");
		car.setDoors("closed");
		car.setSpeed(10);
		System.out.println(car.run());*/
		
		// with constructor
		
		System.out.println(car.run());
		
		System.out.println(car1.run());
		
	}

}
