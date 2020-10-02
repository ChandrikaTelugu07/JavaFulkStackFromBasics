package s9Encapsulation.Main.Encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		/*Person person = new Person();
		System.out.println(person);*/
		
		Person teena = new Person("teena",23,"Female");
		System.out.println(teena);
		teena.setAge(24);
		System.out.println(teena);


	}

}
