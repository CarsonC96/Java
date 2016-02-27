/* Viren Mohindra
 * 3. Write a program that generates a random number from 1 to 100, and asks the user to guess the random number.
 * The program responds with “Number is higher”, “Correct”, or “Number is lower”. Count how many guesses there are.
 */

import java.util.*;
import javax.swing.*;

public class RandomNumber_Worksheet_Question3 {

	public static void main(String[] args) {

		String userInput_in = JOptionPane.showInputDialog("Guess the random number between 1 to 100: ");
		
		Random r = new Random();
		int random = r.nextInt(100) + 1; // 100 is the maximum and 1 is the minimum

		int userInput = Integer.parseInt(userInput_in);
		
		int count = 0;
		int success = 0;
		
		do {
		if (userInput < random) {
			count++;
			JOptionPane.showMessageDialog(null, "Number is higher.");
			userInput_in = JOptionPane.showInputDialog("Please guess again: ");			
			userInput = Integer.parseInt(userInput_in);
			}
		if (userInput > random & userInput < 101) {
			count++;
			JOptionPane.showMessageDialog(null, "Number is lower.");
			userInput_in = JOptionPane.showInputDialog("Please guess again: ");
			userInput = Integer.parseInt(userInput_in);
			}			
		if (userInput == random) {
			count++;
			JOptionPane.showMessageDialog(null, "Correct. The random number was " + random + ". You've guessed " + count + " times.");
			success++;
		if (userInput > 101) {
			JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
			}
		}
	  } while (success < 1);
	}
}
