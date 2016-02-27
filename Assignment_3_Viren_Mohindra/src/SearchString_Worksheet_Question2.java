/* Viren Mohindra
 * 1. Write a program that searches through a string and counts the number of times a letter appears back to back.
 * For example: Professor Moody would give a result of 2, for double “s” in Professor and double “o” in Moody.
 * Do not count blanks or special characters.
 */

import javax.swing.*;

public class SearchString_Worksheet_Question2 {
	public static char chosenChar;

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter string which you want to search: ");
		
		int count = 0;
		char currentChar, currentLowChar, nextChar, nextLowChar;
		
		for (int i = 0; i < s.length() -1; i++) {
			currentChar = s.charAt(i);
			currentLowChar = Character.toLowerCase(currentChar);
			nextChar = s.charAt(i+1);
			nextLowChar = Character.toLowerCase(nextChar);
			if (nextLowChar == currentLowChar && Character.isLetterOrDigit(currentLowChar)) {
				count++;
			chosenChar = currentLowChar;
			}
		}
		JOptionPane.showMessageDialog(null, "A letter is repeated back to back " + count + " times. The last repeated letter is '" + chosenChar + "'");
	}

}