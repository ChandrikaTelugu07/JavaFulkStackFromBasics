package s6p01_flowControl.Example;

public class PrimeNumberTask {

	public static void main(String[] args) {
		
		int flag = 0;
		int isPrime = 11;
		int m = isPrime/2;
		if(isPrime==0 || isPrime ==1) {
			System.out.println("Not Prime");
		}else {
			for(int i =2;i <= m; i++) {
				if(isPrime%i == 0) {
					System.out.println("Not Prime");
					flag=1;
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.println("Prime number "+isPrime);
		}
		

	}

}
