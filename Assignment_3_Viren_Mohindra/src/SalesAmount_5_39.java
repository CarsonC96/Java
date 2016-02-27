/* Viren Mohindra
 * (Financial application:find the sales amount)
 * You have just started a sales job in a department store. Your pay consists of a base salary and a commission.
 * The base salary is $5,000. The scheme shown below is used to determine the commission rate.
 * 
 * Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next $5000 is at 10%, and the rest is at 12%.
 * If the sales amount is 25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 * 
 * Your goal is to earn $30,000 a year. Write a program that finds the minimum sales you have to generate in order to make $30,000.
 */

import javax.swing.*;

public class SalesAmount_5_39 {
	
	static double commissionRate = 0;
    static double commissionAmount = 0;
	static int i = 0;
	static double baseSalary;

public static void main(String[] args) {
	
	String baseSalary_in = JOptionPane.showInputDialog("How much would you like to earn this year?: ");
	
	baseSalary = Double.parseDouble(baseSalary_in);
    
	calculateCommission(baseSalary);
	
	JOptionPane.showMessageDialog(null, "If your commission is $"  + (int) (baseSalary) +
			", Your sale amount should be $" +  i);
	// don't need to add back the $5000 because the method calculateCommission()
	// passes baseSalary by value and not reference

}

public static double calculateCommission(double max) {
	max -= 5000; // since he doesn't need to receive commission for $5000 which is the base amount an employee receives
	
    for (i=1; i >= commissionAmount; i++) {
    	
    	// infinite loop (Used an if statement to break out of the for loop) done below
    	
	    if(i <= 5000) {
	        commissionRate =  0.08;
	    }
	    
	    if(i >= 5001 &&  i <= 10000){
	        commissionRate = 0.10;
	    }
	    
	    if(i >= 10000) {
	        commissionRate = 0.12;    
	    }
	    
	    i ++;
	    // increment number 
	    
	    commissionAmount = i * commissionRate;
	    
	    if (commissionAmount >= max) {
	    	// if in the for loop the Commission Amount reaches the Base Salary
	    	// once being incremented enough - it'll break out and move out of the infinite for loop
	        break;
	        }
    }
	return max;	
  }
}

