package s7p01_JavaMethods;

public class simpleMethod1 {

	public static void main(String[] args) {
		/*
		int i =1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("***********************");
		int j =20;
		while (j <= 40) {
			System.out.println(j);
			j++;
		}*/
		
		/*
		loop1();
		System.out.println("***********************");
		loop2();*/
		
		loop(1,10);
		System.out.println("***********************");
		loop(20,40);

	}
	/*
	public static void loop1(){
		int i =1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}
	public static void loop2(){
		int j =20;
		while (j <= 40) {
			System.out.println(j);
			j++;
		}
	}*/
	public static void loop(int i, int n){
		while (i <= n) {
			System.out.println(i);
			i++;
		}
	}
	
}
