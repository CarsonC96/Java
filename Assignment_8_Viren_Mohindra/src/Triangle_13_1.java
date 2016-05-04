/* Viren Mohindra
 * (Triangle class)
 * Design a new Triangle class that extends the abstract GeometricObject class.
 * Draw the UML diagram for the classes Triangle and GeometricObject and then implement the Triangle class.
 * Write a test program that prompts the user to enter
 * three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled.
 * The program should create a Triangle object with these sides and set the color and filled properties using the input.
 * The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
*/

import java.util.Scanner;

public class Triangle_13_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter three sides of the triangle: ");
		double s1 = in.nextDouble();
		double s2 = in.nextDouble();
		double s3 = in.nextDouble();

		System.out.print("Enter a color: ");
		String c = in.next();

		System.out.print("Is the triangle filled (true | false)?: ");
		boolean f = in.nextBoolean();

		Triangle triangle = new Triangle(s1, s2, s3, c, f);

		System.out.println("\nTriangle #1\n" + triangle);
		
		in.close();
	}
}