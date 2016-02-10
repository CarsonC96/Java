/* 
 * Viren Mohindra
 * (Cost of driving)
 * Write a program that prompts the user to enter the distance to drive,
 * the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * and displays the cost of the trip. Here is a sample run:
 * 
 * Enter the driving distance: 900.5
 * Enter miles per gallon: 25.5
 * Enter price per gallon: 3.55
 * The cost of driving is $125.36
 */

import javax.swing.*; //to read user input

public class drivingCost {

	public static void main(String[] args) {
		
		// input
		String distance_in = JOptionPane.showInputDialog("Enter the driving distance: ");
		String mpg_in = JOptionPane.showInputDialog("Enter miles per gallon: ");
		String price_in = JOptionPane.showInputDialog("Enter price per gallon: ");
		
		// conversion
		double distance = Double.parseDouble(distance_in);
		double mpg = Double.parseDouble(mpg_in);
		double price = Double.parseDouble(price_in);
		
		// formula
		float total = (float) (distance/mpg * price);
		
		// display
		JOptionPane.showMessageDialog(null, "The cost of driving is: " + "$" + total);
		
	}

}
