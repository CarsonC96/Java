/* Viren Mohindra
 * (The Octagon class)
 * Write a class named Octagon that extends GeometricObject and implements the Comparable and Cloneable interfaces.
 * Assume that all eight sides of the octagon are of equal length.
 * The area can be computed using the following formula: area = (2 + 4/22)* side * side
 * 
 * Draw the UML diagram that involves Octagon, GeometricObject, Comparable, and Cloneable.
 * Write a test program that creates an Octagon object with side value 5 and displays its area and perimeter.
 * Create a new object using the clone method and compare the two objects using the compareTo method.
 */

public class OctagonComparable_13_11 {

	public static void main(String[] args) {
		
		Octagon o1 = new Octagon(5);

		System.out.println("Octagon #1:\nArea: " + o1.getArea() + "\nPerimeter: " + o1.getPerimeter());

		//Octagon o2 = (Octagon)o1.clone();

		//int result = (o1.compareTo(o2));
		//if (result == 1)
			System.out.println("\nOctagon is greather than its clone.");
		//else if (result == -1)
		//	System.out.println("\nOctagon is less than its clone."); 
		//else
		//	System.out.println("\nOctagon is equal to its clone.");
	}
}