/* Viren Mohindra
 * (Conversions between feet and meters)
 * Write a class that contains the following two methods:
 * Convert from feet to meters
 * public static double footToMeter(double foot)
 * Convert from meters to feet
 * public static double meterToFoot(double meter)
 * The formula for the conversion is:
 * meter = 0.305 * foot
 * foot  = 3.279 * meter
 * Write a test program that invokes these methods to display the following tables:
*/

public class MetersToFeet_6_9 {

	public static void main(String[] args) {
		
		int m = 15;
		int f = 0;
		
		System.out.println("Feet \t\t Meters \t   |\t Meters \t\t Feet");
		System.out.println("______________________________________________________________________");
		for (int i=1; i<=10; i++) {
			
			m+= 5;
			f++;
			System.out.println(f + " \t\t " + (float) footToMeter(f) + "             |\t\t" + m + "\t\t" + (float) meterToFoot(m));
		}
	}
	
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}
	
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}

}
