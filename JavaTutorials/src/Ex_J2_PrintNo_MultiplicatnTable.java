import java.util.Scanner;
import java.util.stream.IntStream;

public class J2_PrintNo_MultiplicatnTable {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		/*************** Print New Line********************/
		/*
		 * for (int i = 0; i <= 15; i++) {
		 * 
		 * System.out.println(i); }
		 * 
		 * https://howtodoinjava.com/java8/intstream-examples/
		 */
		
		IntStream stream = IntStream.rangeClosed(-15,10);
		stream.forEach(System.out::println);
		
		/***********************************/
		
		System.out.print("\n"); 
		
		/*************** Multiplication of Numbr ********************/
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter the first number : "); 
		  int numbr = s.nextInt();
		  
		  for(int i=1;i<=10;i++ ) { int n1=numbr*i; System.out.println(n1); }
		 
	}
}
