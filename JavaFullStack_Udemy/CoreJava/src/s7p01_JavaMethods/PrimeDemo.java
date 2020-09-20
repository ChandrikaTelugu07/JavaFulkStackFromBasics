package s7p01_JavaMethods;

public class PrimeDemo {

	public static void main(String[] args) {
		Calculate prime = new Calculate();
		if(prime.isPrime(53)) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}

	}

}
