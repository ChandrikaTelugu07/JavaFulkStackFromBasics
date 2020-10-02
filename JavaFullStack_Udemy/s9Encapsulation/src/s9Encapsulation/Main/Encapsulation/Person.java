package s9Encapsulation.Main.Encapsulation;

public class Person {
	
	//hide the info from outside world
	
	private String name ;
	private int age;
	private String gender;
	
	/* to make initialization of compulsory
	
	public Person() {
		this.name = "Abdul";
		this.age = 27;
		this.gender = "Male";
	}
	
	*/
	
	public Person(String name, int age, String gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}



	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}


	public boolean setAge(int age) {
		if (age >=0 && age <=100) {
			this.age = age;
			return true;
		}
		
		else return false;
	}
	
	
	
}
