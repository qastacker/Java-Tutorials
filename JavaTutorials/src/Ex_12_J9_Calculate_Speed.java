import java.util.Scanner;

public class J9_Calculate_Speed {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed;
		Scanner s1 = new Scanner(System.in);
		System.out.print("your high Speed level was: ");
		speed = s1.nextInt();

//		if(speed <=60) {
//			System.out.print("your Speed level: 0");
//		}else if((speed > 60) &&(speed <=80)) {
//			System.out.print("your Speed level: 1");
//		}else if((speed > 80) &&(speed <=100)) {
//			System.out.print("your Speed level: 2");
//		}else if((speed > 100) &&(speed <=120)) {
//			System.out.print("your Speed level: 3");
//		}else if((speed > 120) &&(speed <=140)) {
//			System.out.print("your Speed level: 4");
//		}else if(speed > 140) {
//			System.out.print("your Speed level: 5");
//		}

		System.out.println("When it's your bday?");
		String bday = s1.next();
		String bdayGift = "Today";
		int fSpeed = 0;
		if (bday.equals(bdayGift)) {
			fSpeed = speed - 5;
		} else {
			fSpeed = speed;
		}
		if (fSpeed <= 60) {
			System.out.println("0 = No ticket");
		} else if (fSpeed >= 61 && fSpeed <= 80) {
			System.out.println("1= Small ticket");
		} else {
			System.out.println("2 = big ticket");
		}

	}

}
