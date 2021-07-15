import java.util.Scanner;

public class J6_Check_Alphabet_orNot {

	@SuppressWarnings("resource")
	public static void main(String[] args) { // TODO Auto-generated method stub
		char c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the character : ");
		c = s.next().charAt(0);

			if (Character.isAlphabetic(c)) {
				System.out.println(c + " is a character ");
			} else if (Character.isDigit(c)) {
				System.out.println(c + " is a number");
			} else {
				System.out.println(c + " is a special character");
			}
	}

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your input :");
//		int number = sc.nextInt();
//		if (number >= 65 && number <= 90 || (number >= 97 && number <= 122)) {
//
//			char c = (char) number;
//			System.out.println("An ALPHABET is " + c + " I can read your mind");
//		} else if (number >= 48 && number <= 57) {
//			System.out.println("An Digit is  I can read your mind ");
//
//			// OTHERWISE SPECIAL CHARACTER } else {
//			System.out.println(" Special Character ");
//		}
//	}

	// if((c<= 'a' && >= 'z') || (c <= 'A' && >= 'Z'))
}
