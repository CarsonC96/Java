/* Viren Mohindra
 * 
 */

import java.util.Random;

public class Car_Worksheet_Question1 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		// initialization of array of 10 objects from Car class
		Car[] cars = new Car[10];
		
		// creation of 10 objects
		cars[0] = new Car("Lamborghini", "Yellow", 2011, 0);
		cars[1] = new Car("BMW", "Red", 2010, 0);
		cars[2] = new Car("Bugatti", "Blue", 2014, 0);
		cars[3] = new Car("Aston Martin", "Violet", 2015, 0);
		cars[4] = new Car("Audi", "Indigo", 2012, 0);
		cars[5] = new Car("Cadillac", "Green", 1999, 0);
		cars[6] = new Car("Chevrolet", "Orange", 2000, 0);
		cars[7] = new Car("Ferarri", "Red", 1960, 0);
		cars[8] = new Car("Jaguar", "Purple", 2001, 0);
		cars[9] = new Car("Hyundai", "Black", 1997, 0);
	
	
	for (int i = 0; i < 100; i++) {
			int  a = r.nextInt(3) + 1;
			cars[a] = cars[(int)Math.random() * cars.length]; // OR cars[i] = cars[r.nextInt(cars.length) + 1];
			// randomize probability of choosing specific methods [out of 3]
			int  b = r.nextInt(3) + 1;
	
			switch (b) {
				case 1: cars[b].accelerate(); break;
				case 2: cars[b].brake(); break;
				case 3: cars[b].stop(); break;
	    }
	}
	
	System.out.println("    Car Tests");
	System.out.println("________________");
	
	for (int i = 0; i < cars.length; i++) {
		
		System.out.println("Car Number: " + i);
		System.out.println("Make: " + cars[i].getMake());
		System.out.println("Color: " + cars[i].getColor());
		System.out.println("Year: " + cars[i].getYear());
		System.out.println("Final Speed: " + cars[i].getSpeed());
		System.out.println("________________");
	}
	}
	
	
}

class Car {
	private String Make, Color;
	private int Year, Speed;
	
	// default constructor with my own constructor w/ arguments to make my job easier when creating new objects
	Car() {}
	Car(String newMake, String newColor, int newYear, int newSpeed) {
		Make = newMake; Color = newColor; Year = newYear; Speed = newSpeed;
	}
	
	// getter methods
	String getMake() {return Make;}
	String getColor() {return Color;}
	int getYear() {return Year;}
	int getSpeed() {return Speed;}
	
	// setter methods
	void setMake(String newMake) {Make = newMake;}
	void setColor(String newColor) {Color = newColor;}
	void setYear(int newYear) {Year = newYear;}
	void setSpeed(int newSpeed) {Speed = newSpeed;}	
	
	// specific methods
	int accelerate() {
		if (Year < 2010) {Speed += 15;}
		if (Year >= 2010){Speed += 30;}
		return Speed;
	}
	
	int brake() {
		if (Speed >= 0 && Year < 2010) {Speed -= 5;}
		if (Speed >= 0 && Year >= 2010) {Speed -= 10;}
		return Speed;
	}
	
	int stop(){
		return Speed = 0;
	}
}