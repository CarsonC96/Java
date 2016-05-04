/* Viren Mohindra
 * (The Colorable interface)
 * Design an interface named Colorable with a void method named howToColor().
 * Every class of a colorable object must implement the Colorable interface.
 * Design a class named Square that extends GeometricObject and implements Colorable.
 * Implement howToColor to display the message Color all four sides.
 * 
 * Draw a UML diagram that involves Colorable, Square, and GeometricObject.
 * Write a test program that creates an array of five GeometricObjects.
 * For each object in the array, display its area and invoke its howToColor method if it is colorable.
 * 
 * */
public class ColorableInterface_13_7 {

	public static void main(String[] args) {

		GeometricObject[] squares = {new Square(4.5), new Square(14), 
			new Square(8.2), new Square(12), new Square(10)};
		
		System.out.println("______________________________");
		
		for (int i = 0; i < squares.length; i++) {
			System.out.println("Square Number " + (i + 1));
		 	System.out.println("Area: " + squares[i].getArea());
		 	System.out.println("Color? : " + ((Square)squares[i]).howToColor());
		 	System.out.println("______________________________");
		 }

	}

}
