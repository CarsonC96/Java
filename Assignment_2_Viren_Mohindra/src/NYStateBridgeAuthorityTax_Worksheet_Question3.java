/* Viren Mohindra
 * 1. The New York State Bridge authority collects tolls for vehicle trips on certain bridges.
 * Cars are charged $2.00 from 12 midnight to 6 am (overnight), and $4.00 the other part of the day.
 * Trucks are charged $3.00 per axle overnight, and $6.00 per axle during the day.
 * So a truck with 3 axles driving in the afternoon would be charged $18.
 * Assume military time is input for the time of day.
 * Don’t prompt for information unless necessary.
 */

import javax.swing.*;

public class NYStateBridgeAuthorityTax_Worksheet_Question3 {

	public static void main(String[] args) {

		String militaryTime_in = JOptionPane.showInputDialog("Enter time in military format: ");
		String vehicleType = JOptionPane.showInputDialog("Enter vehicle type [car | truck]: ");
	
		int militaryTime = Integer.parseInt(militaryTime_in);
		int tollCost = 0;
		
		if (militaryTime >= 0 & militaryTime <= 559) {
			if (vehicleType.equals("CAR") | vehicleType.equals("car")) {
				tollCost = 2;
			}
			else if (vehicleType.equals("TRUCK") | vehicleType.equals("truck")) {
				String numberOfAxles_in = JOptionPane.showInputDialog("Enter number of axles in the truck: ");
				int numberofAxles = Integer.parseInt(numberOfAxles_in);
				tollCost = 3 * numberofAxles;
			} 
		}
		else if (militaryTime >= 600 & militaryTime <= 2400) {
			if (vehicleType.equals("CAR") | vehicleType.equals("car")) {
				tollCost = 4;
			}
			else if (vehicleType.equals("TRUCK") | vehicleType.equals("truck")) {
				String numberOfAxles_in = JOptionPane.showInputDialog("Enter number of axles in the truck: ");
				int numberofAxles = Integer.parseInt(numberOfAxles_in);
				tollCost = 6 * numberofAxles;

			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
		}	
		JOptionPane.showMessageDialog(null, "Total toll cost for the " + vehicleType + " is $" + tollCost);
		
	}

}
