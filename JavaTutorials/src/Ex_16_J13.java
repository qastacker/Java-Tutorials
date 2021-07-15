import java.util.Scanner;

public class Ex_16_J13 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c1;
		boolean c2;

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the string:");
		c1 = s1.next();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the exception string:");
		c2 = s2.nextBoolean();
		if (c2 == true) {
			System.out.println(c1.charAt(0));
		} else
			System.out.println(c1.charAt(c1.length() - 1));

	}

}
