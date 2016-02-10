/* 
 * Viren Mohindra
 * (Financial application: calculate future investment value)
 * Write a program that reads in investment amount, annual interest rate, and number of years,
 * and displays the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1,
 * the future investment value is 1032.98.
 * Here is a sample run:
 * Enter investment amount: 1000.56
 * Enter annual interest rate in percentage: 4.25
 * Enter number of years: 1
 * Accumulated value is $1043.92
*/

import javax.swing.*;

public class Finance_2_21 {

	public static void main(String[] args) {
		
		// input
		String investment_in = JOptionPane.showInputDialog("Enter investment amount: ");		
		String interestRate_in = JOptionPane.showInputDialog("Enter annual interest rate in percentage: ");
		String years_in = JOptionPane.showInputDialog("Enter number of years: ");
		
		// conversion
		double investment = Double.parseDouble(investment_in);
		double interestRate = Double.parseDouble(interestRate_in);
		int years = Integer.parseInt(years_in);
		
		// formula
		double monthlyInterestRate = interestRate/12;
		float total = (float) (investment * Math.pow(1 + monthlyInterestRate/100, years*12));
		
		// display
		JOptionPane.showMessageDialog(null, "Accumulated value is: " + "$" + total);
		
		
	}

}
