/* Viren Mohindra
 * (Financial: compare costs)
 * Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the user to enter
 * the weight and price of the each package and displays the one with the better price.
 * Here is a sample run:
 * 
 * Enter weight and price for package 1: 50 24.59
 * Enter weight and price for package 2: 25 11.99
 * Package 2 has a better price. 
 * 
 * Enter weight and price for package 1: 50 25
 * Enter weight and price for package 2: 25 12.5
 * Two packages have the same price. 
 */

import javax.swing.*;

public class CostComparison_3_33 {

	public static void main(String[] args) {
	
		// input
		String weight1_in = JOptionPane.showInputDialog("Enter weight for package 1: ");
		String price1_in = JOptionPane.showInputDialog("Enter price for package 1: ");
		String weight2_in = JOptionPane.showInputDialog("Enter weight for package 2: ");
		String price2_in = JOptionPane.showInputDialog("Enter price for package 2: ");
		
		// conversion
		double weight1 = Double.parseDouble(weight1_in);
		double price1 = Double.parseDouble(price1_in);
		double weight2 = Double.parseDouble(weight2_in);
		double price2 = Double.parseDouble(price2_in);
		
		// formula
		double compare = (weight2 / price2) - (weight1 / price1);
		
		// if statements
		  if (compare == 0) {
			  JOptionPane.showMessageDialog(null, "Two packages have the same price.");
		  }
		  else if (compare < 0) {
			  JOptionPane.showMessageDialog(null, "Package 1 has a better price.");
		  }
		  else if (compare > 0) {
			  JOptionPane.showMessageDialog(null, "Package 2 has a better price.");
		  }
		  else {
			  JOptionPane.showMessageDialog(null, "Invalid Input, please try again.");
		  }

	}

}