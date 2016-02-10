/*Viren Mohindra
 * 1. Write code using to input military time and print the hour and the whether it is AM or PM.
 * Your code should use a JOptionPane to ask the user the military time.
 * The code should produce output as shown on the following table.  
 */

import javax.swing.*;

public class MilitaryTime_Worksheet_Question2 {

	public static void main(String[] args) {
		String militaryTime_in = JOptionPane.showInputDialog("Enter time in military format: ");
		
		int militaryTime = Integer.parseInt(militaryTime_in);
		
		String halfDay = militaryTime >= 1200 ? "PM" : "AM";
		
		if (militaryTime >= 1300) {
			militaryTime -= 1200;
		}
		
		militaryTime /= 100;
		
		if (militaryTime == 0) {
	    JOptionPane.showMessageDialog(null, 12 + " " + halfDay);
		}
		else {
		JOptionPane.showMessageDialog(null, militaryTime + " " + halfDay);
		}
	}	   
}
