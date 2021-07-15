import java.util.Scanner;

public class J5_SqlQuery_RandomNo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * SQL_QUERY
		 * 
		 * SELECT NUM
		 * FROM (SELECT ROWNUM SLNO,NUM
		 * 		FROM(SELECT DISTINCT NUM
		 * 		FROM TABLE
		 * 			ORDER BY NUM DESC))
		 * WHERE SLNO=1;
		 * 
		 * 
		 * 
		 * **/
		int random,numbr;
		random = (int)(Math.random()*9+1);
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter the first number : "); 
		  numbr = s.nextInt();
		  if(numbr == random) {
			  System.out.println("Right Guess, You win 10000USD$");
		  }
		  else if(numbr < random) {
			  System.out.println("low");
		  }else if(numbr > random){
			  System.out.println("high");
		  }
	}

}
