package s6p01_flowControl.Example;

public class BreakAndContinue8 {

	public static void main(String[] args) {
		/*
		for(int i =1; i <= 10; i++) {
			System.out.println(i);
			if(i ==5) {
				break;
			}
		}
		*/
		
		for(int i =1; i <= 10; i++) {
			if(i ==5) {
				continue;
			}
			System.out.println(i);
		}

	}

}