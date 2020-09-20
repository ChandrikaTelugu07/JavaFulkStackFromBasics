package s7p01_JavaMethods;

public class MethodsParameterReturnType2 {

	public static void main(String[] args) {
		//areaOfRect(20.7,10.5);
		double area = areaOfRect(20.7,10.5);
		System.out.println("Area of rectangle : " +area);
		
	}
	/*
	public static void areaOfRect(double l, double b) {
		double area = l * b;
		System.out.println(area);
	}*/
	// Return type
	
	public static double areaOfRect(double l, double b) {
		double area = l * b;
		return area;
	}

}
