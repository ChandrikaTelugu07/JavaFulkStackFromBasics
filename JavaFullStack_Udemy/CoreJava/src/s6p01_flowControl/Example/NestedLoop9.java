package s6p01_flowControl.Example;

public class NestedLoop9 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j =1; j<= 10; j++) {
				System.out.println("Value of i and j " +i +" "+j);
			}
			System.out.println("****************");
		}

	}

}
