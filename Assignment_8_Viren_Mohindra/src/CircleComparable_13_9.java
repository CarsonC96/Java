/* Viren Mohindra
 * (Enable Circle comparable)
 * Rewrite the Circle class in Listing 13.2 to extend GeometricObject and implement the Comparable interface.
 * Override the equals method in the Object class. Two Circle objects are equal if their radii are the same.
 * 
 * Draw the UML diagram that involves Circle, GeometricObject, and Comparable.
 */
public class CircleComparable_13_9 {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(5, "red", true);
		Circle circle2 = new Circle(5, "green", false);
		Circle circle3 = new Circle(4, "green", false);


		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		System.out.println("Circle3 radius: " + circle3.getRadius());

		System.out.println("Circle 1 is " + (circle1.equals(circle2) ? "" : "not ") + "equal to Circle 2");
		System.out.println("Circle 1 is " + (circle1.equals(circle3) ? "" : "not ") + "equal to Circle 3");		
	}
}

