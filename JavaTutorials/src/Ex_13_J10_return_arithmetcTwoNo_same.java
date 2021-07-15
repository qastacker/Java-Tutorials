import java.util.Scanner;

public class Ex_13_J10_return_arithmetcTwoNo_same {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,n2;
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Entr your 1st no: ");
		n1 = s.nextInt();
		System.out.print("Entr your 2nd no: ");
		n2 = s.nextInt();
		n = 6;
		if((n==n1)||(n==n2))
			System.out.print("Correct :"+n);
		else if((n1+n2)==n || (n1-n2)==n || (n2-n1)==n)
			System.out.print("Correct :"+n);
		else
			System.out.print("Incorrect");
		System.out.print("\n*********************JOIN BTW STRING*******************************************\n");
		String st1,st2,newStr;
		Scanner s1 = new Scanner(System.in);
		System.out.print("Entr your 1st string: ");
		st1 = s1.nextLine();
		System.out.print("Entr your 2nd substring: ");
		st2 = s1.nextLine();
		newStr = st1.substring(0,2)+st2+st1.substring(2,4);
		System.out.print(newStr);
		
	}

}
