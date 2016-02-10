/*Viren Mohindra
 * 1. Determine the amount of your restaurant bill. Given a purchase amount, determine the tax amount
 * (8.25%), and the tip amount. The tip amount is 10% for good service, 15% for great service and 20%
 * for excellent service.  The tip percentage is only applied to the purchase amount. Ask the user for
 * the purchase amount, and the service level (good, great, excellent). Output the total (including tip)
 * to be paid. Do not ask for the tip percentage but rather the service level.
 */

import javax.swing.*;

public class RestaurantTip_Worksheet_Question4 {

	public static void main(String[] args) {

		String bill_in = JOptionPane.showInputDialog("Enter Purchase Amount");
		String service = JOptionPane.showInputDialog("How was the service today? [good | great | excellent]");
		
		double bill = Double.parseDouble(bill_in);
		double tax = bill*8.25/100;
		double tip = 0;
				
		if (service.equals("GOOD") | service.equals("good")) {
			tip = bill*10/100;
		}
		else if (service.equals("GREAT") | service.equals("great")) {	
			tip = bill*15/100;
		}
		else if (service.equals("EXCELLENT") | service.equals("excellent")) {
			tip = bill*20/100;
		}
		
		double total = bill + tax + tip;
		JOptionPane.showMessageDialog(null, "Total is $" + total + "/-");
	}

}
