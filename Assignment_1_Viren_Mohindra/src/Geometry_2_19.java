/* 
 * Viren Mohindra
 * (Geometry: area of a triangle)
 * Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3)
 * of a triangle and displays its area. The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2;
 * area = 2s(s - side1)(s - side2)(s - side3)
 * Here is a sample run:
 * 
 * Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
 * The area of the triangle is 33.6
 */

import javax.swing.*;

public class Geometry_2_19 {

	public static void main(String[] args) {

		// input coordinates
		String x1_in = JOptionPane.showInputDialog("Enter x1 coordinate: ");
		String y1_in = JOptionPane.showInputDialog("Enter y1 coordinate: ");
		String x2_in = JOptionPane.showInputDialog("Enter x2 coordinate: ");
		String y2_in = JOptionPane.showInputDialog("Enter y2 coordinate: ");
		String x3_in = JOptionPane.showInputDialog("Enter x3 coordinate: ");
		String y3_in = JOptionPane.showInputDialog("Enter y3 coordinate: ");
		
		// convert string coordinates to double variables
		double x1 = Double.parseDouble(x1_in);
		double y1 = Double.parseDouble(y1_in);
		double x2 = Double.parseDouble(x2_in);
		double y2 = Double.parseDouble(y2_in);
		double x3 = Double.parseDouble(x3_in);
		double y3 = Double.parseDouble(y3_in);
		
		// formula to calculate side of a triangle
		double side1 = Math.pow((Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0)), 0.5);
		double side2 = Math.pow((Math.pow((x3 - x2), 2.0) + Math.pow((y3 - y2), 2.0)), 0.5);
		double side3 = Math.pow((Math.pow((x3 - x1), 2.0) + Math.pow((y3 - y1), 2.0)), 0.5);

		// formula to calculate area of a triangle
		double s = (side1 + side2 + side3)/2;
		double a = (s * (s - side1) * (s - side2) * (s - side3));
		float area = (float) Math.pow(a, 0.5);
		
		// display output
		JOptionPane.showMessageDialog(null, "The area of the triangle is: " + area);
	}

}
