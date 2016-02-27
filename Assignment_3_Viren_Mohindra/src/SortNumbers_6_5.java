/* Viren Mohindra
 * (Sort three numbers)
 * Write a method with the following header to display three numbers in increasing order:
 * public static void displaySortedNumbers( double num1, double num2, double num3)
 * Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.
 */

import javax.swing.*;

public class SortNumbers_6_5 {

	public static void main(String[] args) {
		
		String n1_in = JOptionPane.showInputDialog("Enter first number: ");
		String n2_in = JOptionPane.showInputDialog("Enter second number: ");
		String n3_in = JOptionPane.showInputDialog("Enter third number: ");
		
		double n1 = Double.parseDouble(n1_in);
		double n2 = Double.parseDouble(n2_in);
		double n3 = Double.parseDouble(n3_in);
		
		displaySortedNumbers(n1, n2, n3);
	}
	
	public static void displaySortedNumbers (double num1, double num2, double num3) {
		if (num2 < num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 < num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 < num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
			
		}
		JOptionPane.showMessageDialog(null, "The numbers in increasing order are " + (int) num3 + " " + (int) num2 + " " + (int) num1);
	}

}
