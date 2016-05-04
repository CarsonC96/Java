/* Viren Mohindra
 * (Enable GeometricObject comparable)
 * Modify the GeometricObject class to implement the Comparable interface,
 * and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects.
 * Draw the UML diagram and implement the new GeometricObject class.
 * Write a test program that uses the max method to find the larger of two circles and the larger of two rectangles.
 * */

public class WhichIsLarger_13_5 {

	public static void main(String[] args) {

		Circle circle1 = new Circle(15, "red", true);
		Circle circle2 = new Circle(10, "blue", false);

		System.out.println("Circle #1");
		System.out.println(circle1);

		System.out.println("Circle #2");
		System.out.println(circle2);

		System.out.println("The larger of the two circles was ");
		System.out.println("_______________________");

		Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
		Rectangle rectangle2 = new Rectangle(4.2, 5, "orange", true);

		System.out.println("\nRectangle 1: ");
		System.out.println(rectangle1);

		System.out.println("\nRectangle 2: ");
		System.out.println(rectangle2);

		System.out.println("\nThe larger of the two rectangles was ");
		System.out.println("_______________________");
	}
}
