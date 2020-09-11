package s6p01_flowControl.Example;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		// float cannot be used in switch case only int,String,Char and enum	
		//float x =1.0F;
		
		char ch = 'c';// case sensitive
		
		switch(ch) {
		case 'a':
		case 'A':
				System.out.println("The value is A");
				break;
		case 'b':
		case 'B':
				System.out.println("The value is B");
				break;
		case 'C':
		case 'c':
				System.out.println("The value is C");
				break;
		default:
				System.out.println("The value is other han a,b,c");
				break;
		}
	}

}
