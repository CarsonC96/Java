/* Viren Mohindra
 * (Geometry: n-sided regular polygon)
 * In an n-sided regular polygon, all sides have the same length and all angles have the same degree
 * (i.e., the polygon is both equi-lateral and equi-angular). Design a class named RegularPolygon that contains:
 * ■ A private int data field named n that defines the number of sides in the polygon with default value 3.
 * ■ A private double data field named side that stores the length of the side with default value 1.
 * ■ A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
 * ■ A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
 * ■ A no-arg constructor that creates a regular polygon with default values.
 * ■ A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
 * ■ A constructor that creates a regular polygon with the specified number of sides, length of side, and x-and y-coordinates.
 * ■ The accessor and mutator methods for all data fields.
 * ■ The method getPerimeter() that returns the perimeter of the polygon.
 * computing the area of a regular polygon is Area = p . 4*tan¢ ≤
 * ■ The method getArea() that returns the area of the polygon. The formula for 
 */

public class RegularPolygon_9_9 {
	public static void main(String[] args) {
		 RegularPolygon p1 = new RegularPolygon();
		 RegularPolygon p2 = new RegularPolygon(6, 4);
		 RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
		 
		 System.out.println("Perimeter of p1 is: " + p1.getPerimeter() + ". Area of p1 is: " + p1.getArea());
		 System.out.println("Perimeter of p2 is: " + p2.getPerimeter() + ". Area of p2 is: " + p2.getArea());
		 System.out.println("Perimeter of p3 is: " + p3.getPerimeter() + ". Area of p3 is: " + p3.getArea());
	}
}

class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	RegularPolygon() {
	}
	
	RegularPolygon(int newN, double newSide) {
		n = newN;
		side = newSide;
	}
	
	RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	
	
	int getN() {return n;}
	double getSide() {return side;}
	double getX() {return x;}
	double getY() {return y;}
	
	void setN(int newN) { n = newN;}
	void setSide(double newSide) {side = newSide;}
	void setX(double newX) {x = newX;}
	void setY(double newY) {y = newY;}
	
	double getPerimeter() {
		return side * n;
	}
	
	double getArea() {
		double a = (n * Math.pow(side, 2) / (4*Math.tan(Math.PI/n)));
		return a;
	}

}