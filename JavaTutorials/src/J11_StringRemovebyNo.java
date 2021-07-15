import java.util.Scanner;

public class J11_StringRemovebyNo {

	public static void deleteChar(String s, int index) {
		if (index < 0 || index > s.length() - 1) {
			System.out.println("Error!!!!");
		} else {
			char[] ch = new char[s.length() - 1];
			for (int i = 0; i < s.length() - 1; i++) {
				if (i < index)
					ch[i] = s.charAt(i);
				else
					ch[i] = s.charAt(i + 1);
			}
			String newString = new String(ch);
			System.out.println("String after removing character : " + newString);
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String word, ans;

		Scanner s = new Scanner(System.in);
		System.out.print("Entr the word: ");
		word = s.nextLine();
		System.out.print("Entr the no: ");
		n = s.nextInt();
		ans = word.substring(0, n) + word.substring(n + 1);
		System.out.print("Ans: " + ans);
		
		
		System.out.print("*********************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		System.out.println("Enter the index : ");
		int i = sc.nextInt();
		sc.close();
		deleteChar(str, i);
	}

}
