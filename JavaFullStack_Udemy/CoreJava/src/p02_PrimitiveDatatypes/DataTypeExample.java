package p02_PrimitiveDatatypes;
import java.math.BigDecimal;

public class DataTypeExample {

	public static void main(String[] args) {
		
		/*
		int value1=10, value2 = 20; 
		int value3 = (value2*value2) - value1;
		//short,long,byte
		float value =9f;
		double=9d;
		System.out.println(value);
		*/
		
		/*percentage
		int marker = 512;
		double percentage = marker * 0.46f; // 46% percentage of marker
		System.out.println("46% of " +marker + " is " + percentage);
		*/
		/*
		boolean var = true;
		System.out.println(var);
		*/
		/* stores as unicode
		char ch = '\u00A7'; //unicode
		System.out.println(ch);
		*/
		
		
		double x = 1.05;
		double y = 2.55;
		System.out.println(x+y);
		
		//rounding of varibales
		BigDecimal d1 = new BigDecimal("1.05");// as string to enable rounding of digits
		BigDecimal d2 = new BigDecimal("2.55");
		System.out.println(d1.add(d2));
		

	}

}
