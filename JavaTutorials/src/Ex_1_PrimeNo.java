import java.util.Scanner;

public class Ex_1_PrimeNo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/************* Prime Number **********/
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		int start = s.nextInt();
		System.out.print("Enter the Ending number : ");
		int end = s.nextInt();

		
			for (int i = start; i <= end; i++) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
	}

	public static boolean isPrime(int i) {
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			} 
		}
		return true;
	}
	
	

}
