public class Triangle extends GeometricObject {

	private double side1; 
	private double side2; 
	private double side3;

	public Triangle() {
	} 

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this(side1, side2, side3);
		setColor(color);
		setFilled(filled); 
	}

	
	public double getS1() {
		return side1;
	}
	public void setS1(double side1) {
		this.side1 = side1;
	}
	public double getS2() {
		return side2;
	}
	public void setS2(double side2) {
		this.side2 = side2;
	}
	public double getS3() {
		return side3;
	}
	public void setS3(double side3) {
		this.side3 = side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter(); 
	}
}