/*
 * Viren Mohindra
 * (Geometry: distance of two points)
 * Write a program that prompts the user to enter two points
 * (x1, y1) and (x2, y2)and displays their distance between them.
 * The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2.
 * Note that you can use Math.pow(a, 0.5) to compute 2a.
 * Here is a sample run:
 * Enter x1 and y1: 1.5 -3.4
 * Enter x2 and y2: 4 5
 * The distance between the two points is 8.764131445842194
 */

import javax.swing.*; //to read user input

public class Geometry_2_15 {

	public static void main(String[] args) {
		

		String x1_in = JOptionPane.showInputDialog("Enter x1: ");
		String y1_in = JOptionPane.showInputDialog("Enter y1: ");
		String x2_in = JOptionPane.showInputDialog("Enter x2: ");
		String y2_in = JOptionPane.showInputDialog("Enter y2: ");
		
		double x1 = Double.parseDouble(x1_in);
		double y1 = Double.parseDouble(y1_in);
		double x2 = Double.parseDouble(x2_in);
		double y2 = Double.parseDouble(y2_in);
		
		double calc = (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double total = Math.pow(calc, 0.5);
		
		JOptionPane.showMessageDialog(null, "The distance between the two points is " + total);
		
	}

}
