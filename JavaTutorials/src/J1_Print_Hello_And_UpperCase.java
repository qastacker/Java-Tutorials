
public class J1_Print_Hello_And_UpperCase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AHCECLWLXO";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {
				System.out.print(s.charAt(i));
			}
		}
		
		System.out.print("\n");
		
		String s1 = "ahceclwlxo";
		for (int i = 0; i < s1.length(); i++) {
			if (i % 2 != 0) {
				System.out.print(s1.toUpperCase().charAt(i));
			}
		}
	}

}
