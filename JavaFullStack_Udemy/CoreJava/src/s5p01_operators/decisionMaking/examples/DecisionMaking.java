package s5p01_operators.decisionMaking.examples;

public class DecisionMaking {

	public static void main(String[] args) {
		
		//int x =5;
		
		/* - == Opeator
		if(x==5) {
			System.out.println("X value is: " +x);
		}
		else {
			System.out.println("Value is different");
		}
		*/
		
		/* - != Opeator
		if(x!=5) {
			System.out.println("Value is different"); 
		}
		else {
			System.out.println("X value is: " +x);
		}
		*/
		
		/* -- < and <=
		 
		if(4 < x) {
			System.out.println(true); 
		}
		else {
			System.out.println(false);
		}
		 */
		
		/*
		//-- > and >=
		 
		if(9 > x) {
			System.out.println(true); 
		}
		else {
			System.out.println(false);
		}

		boolean a = true;
		boolean b = false;
		
		//&& - if all the operands are true than only over all operation is true
		if (a && b) {
			System.out.println("Condistion is TRUE");
		}
		else {
			System.out.println("Condistion is FALSE");
		}

		//|| - if any one the operand is true than  over all operation is true
		if (a || b) {
			System.out.println("Condistion is TRUE");
		}
		else {
			System.out.println("Condistion is FALSE");
		}
		
		// ! 
		if (!b) {
			System.out.println("Condistion is TRUE");
		}
		else {
			System.out.println("Condistion is FALSE");
		}
		
		
		if (!(a && b)) {
			System.out.println("Condistion is TRUE");
		}
		else {
			System.out.println("Condistion is FALSE");
		
		}
		*/
		
		int ageOfBoy = 21;
		int ageOfGirl = 19;
		
		if((ageOfBoy>= 21) && (ageOfGirl >=18)) {
			System.out.println("Legal to get married");
		}
		else {
			System.out.println("Illegal");
		}

	}

}
