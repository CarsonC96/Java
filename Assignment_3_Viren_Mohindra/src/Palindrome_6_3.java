/* Viren Mohindra
 * (Palindrome integer)
 * Write the methods with the following headers
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static int reverse(int number)
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself.
 * Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 */

import javax.swing.*;

public class Palindrome_6_3 {
	
	public static void main(String[] args) {
		String number_in = JOptionPane.showInputDialog("Enter number: ");
		
		int number = Integer.parseInt(number_in);
		
		if (isPalindrome(number)) {
			JOptionPane.showMessageDialog(null, "The number " + number + " is a palindrome.");			
		}
		else {
			JOptionPane.showMessageDialog(null, "The number " + number + " is not a palindrome.");
		}
	}

	public static int reverse(int num) {
		int reverse = 0;
			do {
				reverse = (reverse * 10) + ( num % 10);
	            num /= 10;
			} while (num != 0);
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		return (number == reverse(number));
	}
}
