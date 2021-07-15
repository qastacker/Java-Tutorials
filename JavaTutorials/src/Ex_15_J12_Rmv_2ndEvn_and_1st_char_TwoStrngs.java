import java.util.Scanner;

public class Ex_15_J12_Rmv_2ndEvn_and_1st_char_TwoStrngs {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		Scanner s = new Scanner(System.in);
		System.out.println("Entr the word: ");
		word = s.nextLine();

		if (word.length() % 2 == 0) {
			char[] chars = word.toCharArray();
			for (int i = 0; i < chars.length / 2; i++) {
				System.out.println(chars[i]);
			}
		}
		
		System.out.println("***************************************");
		
		String w1,w2,ans1,ans2,ans;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Entr the word1: ");
		w1 = s1.nextLine();
		System.out.println("Entr the word1: ");
		w2 = s1.nextLine();
		ans1 = w1.substring(1);
		ans2 = w2.substring(1);
		ans = ans1.concat(ans2);
		System.out.println("Ans: " +ans);
	}
}
