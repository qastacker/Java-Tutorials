import java.util.Scanner;

public class Ex_2_Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/************* Prime Number **********/
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		int no = s.nextInt();
		 int f=1;
		 for(int i=1;i<=no;i++) {
			 f=f*i;
		 }
		 System.out.println("Factorial of "+no+" is: "+f);
	}

}
