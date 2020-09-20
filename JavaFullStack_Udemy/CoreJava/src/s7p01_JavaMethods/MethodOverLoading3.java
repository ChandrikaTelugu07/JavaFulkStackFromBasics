package s7p01_JavaMethods;

public class MethodOverLoading3 {

	public static void main(String[] args) {
		System.out.println("Area of rectangle: " + area(14.25d,12.15d));
		System.out.println("Area of Sqaure: " + area(12.5d));
		System.out.println("Area of Sqaure for int return type: " + area(5));

	}
	public static double area(double l, double b) {
		return l * b;
	}
	
	public static double area(double a) {
		return a * a;
	}
	
	public static int area(int a) {
		return a * a;
	}

}
