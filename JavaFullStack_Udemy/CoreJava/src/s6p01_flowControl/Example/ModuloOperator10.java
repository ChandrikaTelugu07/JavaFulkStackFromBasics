package s6p01_flowControl.Example;

public class ModuloOperator10 {

	public static void main(String[] args) {
		
		/*int x = 12;
		
		if (x % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}*/
		int x= 12345;
		int sum =0;
		while( x != 0) {
			int div  = x % 10;
			x = x/10;
			sum = sum + div;
		}
		System.out.println(sum);

	}

}
