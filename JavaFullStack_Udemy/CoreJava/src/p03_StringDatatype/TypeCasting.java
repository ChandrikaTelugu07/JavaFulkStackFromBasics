package p03_StringDatatype;

public class TypeCasting {

	public static void main(String[] args) {
		// Type casting - coversion of one data type to another
		
		//implicit type casting(widening) - automatic type casting(assigning smallest data type to largest data type)
		short x =5;
		int y =x;
		System.out.println(y);
		
		float v1 = 10.0f;
		double v2 = v1;
		System.out.println(v2);
		
		//explicit type casting (narrowing) - there may be loss of info
		int a =10;
		short b = (short)a; // as we are converting to short
		System.out.println(b);
		
		double c = 10.0d;
		float d = (float) c;
		System.out.println(d);
		
		double x1 = 10.0123456789d;
		float x2 = (float) x1;
		System.out.println(x2);
		
		float s = 10.0f;
		int s2 = (int) s;
		System.out.println(s2);
		
		
		

	}

}
