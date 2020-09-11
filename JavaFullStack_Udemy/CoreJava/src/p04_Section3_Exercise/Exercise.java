package p04_Section3_Exercise;

public class Exercise {

	public static void main(String[] args) {
		// (a+b)2 = a2+2ab+b2
		int  a = 25;
		float b =42.159f;
		double value = (a*a) + 2*(a*b) + b*b;
		System.out.println(value);
		
		// explicit type casting
		int  x = 25;
		float y =42.159f;
		int eq = (int)((x*x) + 2*(x*y) +  y*y);
		System.out.println(eq);

		
		

	}

}
