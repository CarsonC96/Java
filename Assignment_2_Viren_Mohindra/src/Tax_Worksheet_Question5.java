/*Viren Mohindra
 * 1. The tax law has two ways to calculate your taxes. The first way is 10% of your total income.
 * Earning $50,000, means your taxes are $5,000.  The other way is to take 15% of your total income
 * minus deductions (like charitable contributions). So if you earn $50,000, and have $30,000
 * in deductions you pay 15% of $20,000 (difference between income and deductions) = $3,000.
 * The government forces you to pay the greater of the two methods which would be $5000 in this example.
 * Prompt the user for the total income and the deductions, and determine the taxes owed.
 */

import javax.swing.*;

public class Tax_Worksheet_Question5 {

	public static void main(String[] args) {

		String totalIncome_in = JOptionPane.showInputDialog("Enter your total income: ");
		String deductions_in = JOptionPane.showInputDialog("Enter your total deductions if you have any: ");
		
		double totalIncome = Double.parseDouble(totalIncome_in);
		double deductions = Double.parseDouble(deductions_in);
		
		double totalTaxableMoney = totalIncome - deductions;
		
		double taxOnIncomeOnly = totalIncome*10/100;
		
		double taxOnIncomeAndDeductions = totalTaxableMoney*15/100;
		
		if (taxOnIncomeOnly > taxOnIncomeAndDeductions) {
			JOptionPane.showMessageDialog(null, "Taxes owed are: $" + taxOnIncomeOnly + "/-");
		}
		else {
			JOptionPane.showMessageDialog(null, "Taxes owed are: $" + taxOnIncomeAndDeductions + "/-");
		}
	}

}
