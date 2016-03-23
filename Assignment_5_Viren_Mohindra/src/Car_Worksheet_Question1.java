/* Viren Mohindra
 *
 * Construct a calling class and a Car class as follows:
 * Car Class:
 * Properties:  Make (String), Year(int), Color(String), Speed (int)
 * Methods:
 * •	All getter, setter methods
 * •	Accelerate ( increase speed :  15MPH if year < 2010,  30 MPH >= 2010)
 * •	Brake ( lower speed :   5MPH if year < 2010,  10 MPH >= 2010, speed always >=0)
 * •	Stop (speed = 0)
 * Create an array of 10 cars. Give them random colors and makes of your choice. Select a random year for a car, but when done,
 * half the cars should have a year >=2010.  Initial Speed is zero.
 * Do the following 100 times:
 * •	Pick a random car
 * •	Randomly select Brake, Accelerate or Stop method (equal probabilities)
 * •	Invoke the selected method chosen for the car chosen
 * After the loop, print out the car number, year, make, color and final speed.
*/

import java.util.Random;

public class Car_Worksheet_Question1 {
	
	static int LIMIT = 100;
	
	public static void main(String[] args) {
	
		Random r = new Random();
		
		// initialization of array of 10 objects from Car class
		Car[] cars = new Car[10];
		
		String[] makeArray = {"Lamborghini", "BMW", "Bugatti", "Aston Martin", "Audi", "Cadillac", "Chevrolet", "Ferarri", "Jaguar", "Hyundai"};
		String[] colorArray = {"Yellow", "Red", "Blue", "Violet", "Indigo", "Green", "Orange", "Red", "Purple", "Black"};
		
		
		// populating 10 objects of array cars
		for (int i=0; i < cars.length; i++) {
			if (i < 5) {
				cars[i] = new Car(makeArray[r.nextInt(10)], colorArray[r.nextInt(10)], r.nextInt(6) + 2010, 0);
			}
			else cars[i] = new Car(makeArray[r.nextInt(10)], colorArray[r.nextInt(10)], r.nextInt(10) + 1997, 0);
		}
	
	
	for (int i = 0; i < LIMIT; i++) {
		
		Car carR = cars[r.nextInt(10)]; 
			
			// randomize probability of choosing specific methods [out of 3]
			int  b = r.nextInt(3) + 1;
	
			switch (b) {
				case 1: carR.accelerate(); break;
				case 2: carR.brake(); break;
				case 3: carR.stop(); break;
	    }
	}
	
	System.out.println("    Car Tests");
	System.out.println("________________");
	
	for (int i = 0; i < cars.length; i++) {
		
		System.out.println("Car Number: " + (i+1));
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
	void accelerate() {
		if (Year < 2010) {Speed += 15;}
		if (Year >= 2010){Speed += 30;}
	}
	
	void brake() {
		if (Speed >= 0 && Year < 2010) {Speed -= 5;}
		if (Speed >= 0 && Year >= 2010) {Speed -= 10;}
		if (Speed < 0) {Speed = 0;}
	}
	
	void stop(){
		Speed = 0;
	}
}