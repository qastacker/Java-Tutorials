import java.util.Scanner;

public class J8_Reverse_String_and_Eb_bill {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,rev="";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the character : ");
		str = s.nextLine();
		if(str!="") {
			
			char ch[]=str.toCharArray();    
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }
			System.out.println("The reverse string is: "+rev);
		}

		/**************************************************************/
		System.out.println("**********************************************************");
		/**************************************************************/
		int eBill = 0, ec, ec1 = 0;
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter your Electric Consumption : ");
		ec = s1.nextInt();
		if (ec <= 100) {
			eBill = ec * 10;
		} else if ((ec > 100) && (ec <= 200)) {
			ec1 = ec - 100;
			eBill = (100 * 10) + (ec1 * 15);
		} else if ((ec > 200) && (ec <= 300)) {
			ec1 = ec - 200;
			eBill = (100 * 10) + (100 * 15) + (ec1 * 20);
		} else if(ec > 300) {
			ec1 = ec - 250;
			eBill = (100 * 10) + (100 * 15) + (100 * 20) + (ec1 * 25);
		}
		System.out.print("Enter your Electric Consumption : " + eBill);
	}
}
