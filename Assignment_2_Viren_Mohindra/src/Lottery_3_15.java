/* Viren Mohindra
 * (Game: lottery)
 * Revise Listing 3.8, Lottery.java, to generate a lottery of a three- digit number.
 * The program prompts the user to enter a three-digit number and determines whether the user wins
 * according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
*/

import javax.swing.*;

public class Lottery_3_15 {

	public static void main(String[] args) {
		  // Generate a lottery with Math.random()
		  int lottery = (int) (Math.random() * 1000); //because it is three numbers now
	
		  // Input
		  String guess_in = JOptionPane.showInputDialog("Enter your lottery pick (three numbers in XXX format): ");
		  
		  // Conversion
		  int guess = Integer.parseInt(guess_in);
		  
		  // Get digits from lottery
		  int lottery1 = lottery / 100;
		  int lottery2 = (lottery % 100) / 10; // middle number
		  int lottery3 = lottery % 10;
		 
		  // Get digits from guess
		  int guess1 = guess / 100;
		  int guess2 = (guess % 100) / 10; // middle number
		  int guess3 = guess % 10;
		  
		  JOptionPane.showMessageDialog(null, "The lottery number is " + lottery);
		 
		  // Check the guess
		  if (guess == lottery) {
			  	  JOptionPane.showMessageDialog(null, "Exact match: you win $10,000!");
		  }
		  else if ((guess1 == lottery2 && guess2 == lottery1 && guess3 == lottery3)
				  || (guess1 == lottery2 && guess1 == lottery3 && guess3 == lottery1)
				  || (guess1 == lottery3 && guess2 == lottery1 && guess3 == lottery2)
				  || (guess1 == lottery3 && guess2 == lottery2 && guess3 == lottery1)
				  || (guess1 == lottery1 && guess2 == lottery3 && guess3 == lottery2)) {
			  	  JOptionPane.showMessageDialog(null,"Matched all digits: you win $3,000!");
		  }
		  else if (guess1 == lottery1 || guess1 == lottery2 || guess1 == lottery3
				  || guess2 == lottery1 || guess2 == lottery2 || guess2 == lottery3
				  || guess3 == lottery1 || guess3 == lottery2 || guess3 == lottery3) {
			      JOptionPane.showMessageDialog(null,"Matched one digit: you win $1,000!");
		  }
		  else {
			      JOptionPane.showMessageDialog(null,"Sorry, no match, you do not win anything.");
		  }
	}

}