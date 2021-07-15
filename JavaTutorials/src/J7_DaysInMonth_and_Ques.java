

public class J7_DaysInMonth_and_Ques{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 31;
		String firstday = "Saturday";
		noOfDays(n, firstday);

	}

	public static void noOfDays(int n, String firstday) {
		
		
		// stores days in a week
		String[] days = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		// Initialize all counts as 4.
		int[] count = new int[7];
		for (int i = 0; i < 7; i++)
			count[i] = 4;

		// find index of the first day
		int pos = 0;
		for (int i = 0; i < 7; i++) {
			if (firstday == days[i]) {
				pos = i;
				break;
			}
		}

		// number of days whose occurrence
		// will be 5
		int inc = n - 28;

		// mark the occurrence to be 5 of n-28 days
		for (int i = pos; i < pos + inc; i++) {
			if (i > 6)
				count[i % 7] = 5;
			else
				count[i] = 5;
		}

		// print the days
		for (int i = 0; i < 7; i++) {
			System.out.println(days[i] + " " + count[i]);
		}
	}
	/*
	 * 3)If a client connects to a web service, how do we identify the user?
	 * HTTP includes built-in support for Basic and Digest authentication.
	 * SOAP Digital Signature (SOAP-DSIG) leverages public key cryptography to digitally sign SOAP messages. 
	 * It enables the client or server to validate the identity of the other party.
	 * 
	 * 4) What HTTP Status Code 409 states in web-service, explain with example.
	 * If there is a record exist in DB and we do post for that same record in that case server will return 409 error code
	 * 
	 * 5)An apple costs 40 cents, a banana costs 60 cents, and a grapefruit costs 80 cents. How much does a pear cost?
	 * Apple-> 2 vowels -->40cents : Banana-->3 vowels-->60cents : Grapefruit-->4 vowels -->80cents : 
	 * So from above examples we can say that each vowel is equals to 20cents. So Pear --> 2 vowels--> 40cents. So answer is Pear costs 40cents.
	 * 
	 * 6)Why are manhole covers round and not square?
	 * A: A manhole round can be rotate in any ways and it will not fall into it. So it is safer to use round than square. Square will fall in to it
	 * B: Manhole cover is round because we can transfer that cover from one place to another by simply rotating the cover , 
	 * so it more easier than any other shapes
	 * 
	 * 7) Is it better to be perfect and late, or good and on time?
	 * As a general rule, managers prefer “good and on time”, 
	 * as they don’t appreciate work to stay pending because of the employees’ need for perfection
	 * 
	 * 8) Describe a bad experience you had working with your ex-employer
	 * 	 Never bad-mouth previous colleagues and ex-employees. 
	 * 	 Instead of focusing on the details of the incident, put more emphasis on the part where you managed to make him see your point-of-view.
	 * 	 For example : “They were thinking from a different point of view, but in the end, they managed to understand my concerns as well.”
	 * **/
}

