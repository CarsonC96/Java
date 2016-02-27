/* Feb 17 2016
 * Practicing random number generation for cards
 */

import java.util.Random; // randomize number

public class RoyalStraightFlush_Worksheet_Question1 {

	static int dealtNumber, dealtSuit;
	static Random r = new Random();
	static String res;
	static int c1, c2, c3, c4, c5;
	static int s1, s2, s3, s4, s5;
	
	public static void main(String[] args) {

		chooseCard(s1, c1);
		chooseCard(s2, c2);
		chooseCard(s3, c3);
		chooseCard(s4, c4);
		chooseCard(s5, c5);
		
	int i=0;	
	while (i<1) {
		
		if (s1 == s2 && s2 == s3 && s3 == s4 && s4 == s5) {
			System.out.println("You chose the " + getSuitNumber(dealtNumber) + " of " + getSuitName(dealtSuit));
		}
		else {
			System.out.println("didn't work.");
		}
	}
}
	public static void chooseCard(int dealtSuit, int dealtNumber) {
		int dealtCard;
		
		dealtCard = r.nextInt(52) + 1;
		
		dealtSuit = (dealtCard % 4);
		dealtNumber = (dealtCard % 13) + 1;

		getSuitNumber(dealtSuit);
		getSuitName(dealtNumber);
		
	}
	
	public static String getSuitNumber(int num) {
		String number;
		switch (num) {
		case 11:
			number = "Jack";
			break;
		case 12:
			number = "Queen"; 
			break;
		case 13:
			number = "King"; 
			break;		
		default:
			number = Integer.toString(num); // using default as a non exception case for cardNumbers other than strings
			break;
		}
		return number;
	}
	
	public static String getSuitName(int insuit) {
		switch (insuit) {
		case 0:
			res = "Spades";
			break;
		case 1:
			res = "Clubs";
			break;
		case 2:
			res = "Hearts";
			break;
		case 3:
			res = "Diamonds";
			break;
		}
		return res;
	}

}