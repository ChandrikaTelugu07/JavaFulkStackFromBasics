package s7p01_JavaMethods;

public class MethodOverLoading4 {

	public static void main(String[] args) {
		System.out.println(sum(6,7));
		System.out.println(sum(6,7.9f));
		System.out.println(sum(60.765d,70.9d));
		System.out.println(sum(10,8,654));

	}
	public static int sum (int x, int y) {
		System.out.println("Adding 2 int entities");
		return x + y;
	}
	
	public static float sum (int x, float y) {
		System.out.println("Adding 1 int entitity and 1 float entitity ");
		return x + y;
	}
	
	public static double sum (double x, double y) {
		System.out.println("Adding 2 double entities");
		return x + y;
	}
	
	public static int sum (int x, int y, int z) {
		System.out.println("Adding 3 int entities");
		return x + y + z;
	}

}
