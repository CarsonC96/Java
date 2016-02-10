/* 
 * Viren Mohindra
 * (Science: wind-chill temperature)
 * How cold is it outside? The temperature alone is not enough to provide the answer.
 * Other factors including wind speed, relative humidity, and sunshine play important roles
 * in determining coldness outside. In 2001, the National Weather Service (NWS)
 * implemented the new wind-chill temperature to measure the coldness using temperature and wind speed.
 * The formula is twc = 35.74 + 0.6215ta - 35.75^0.16 + 0.4275^0.16
 * where ta is the outside temperature measured in degrees Fahrenheit
 * and v is the speed measured in miles per hour. twc is the wind-chill temperature.
 * The formula cannot be used for wind speeds below 2 mph or temperatures below -58oF or above 41oF.
 * 
 * Write a program that prompts the user to enter a temperature between - 58 oF and 41oF and
 * a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 * Use Math.pow(a, b) to compute v0.16. Here is a sample run:
 * 
 * Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
 * Enter the wind speed (>=2) in miles per hour: 6
 * The wind chill index is -5.56707
 */

import javax.swing.*; //to read user input

public class isItCold_2_17 {

	public static void main(String[] args) {
		
		
		String temp_in = JOptionPane.showInputDialog("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		String windSpeed_out = JOptionPane.showInputDialog("Enter the wind speed (>=2) in miles per hour: ");
		
	
		double temp = Double.parseDouble(temp_in);
		double windSpeed = Double.parseDouble(windSpeed_out);

		// formula
		double windChill = (35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16)));

	
		
		JOptionPane.showMessageDialog(null, "The wind chill index is: " + windChill);
		
		if (windChill < 10) {
			JOptionPane.showMessageDialog(null, "It feels pretty cold!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Hang in there!");
		}

	}

}
