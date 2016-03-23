/* Viren Mohindra
 * (The Account class)
 * Design a class named Account that contains:
 * ■ A private int data field named id for the account (default 0).
 * ■ A private double data field named balance for the account (default 0).
 * ■ A private double data field named annualInterestRate that stores the current interest rate (default 0).
 * Assume all accounts have the same interest rate.
 * ■ A private Date data field named dateCreated that stores the date when the account was created.
 * ■ A no-arg constructor that creates a default account.
 * ■ A constructor that creates an account with the specified id and initial balance.
 * ■ The accessor and mutator methods for id, balance, and annualInterestRate.
 * ■ The accessor method for dateCreated.
 * ■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * ■ A method named getMonthlyInterest() that returns the monthly interest.
 * ■ A method named withdraw that withdraws a specified amount from the account.
 * ■ A method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class and then implement the class.
 * (Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12.
 * Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%.
 * Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest,
 * and the date when this account was created.
 */

// Main Class
public class AccountTest_9_7 {

	public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: $" + account.getBalance());
        
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("___________________________");
        System.out.println("Balance Statement: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Time of account creation: " + account.getDateCreated());

	}

}

// Account Class
class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0.0; // Assume all accounts have the same interest rate
	java.util.Date date = new java.util.Date() ; // using from java.util.Date class
	private String dateCreated = date.toString(); // converts current time into a string
	
	// constructors
	Account() {
	}
	Account(int newIdentity, double newBalance) {
		id = newIdentity;
		balance = newBalance;
	}
	
	// balance statement methods
	void withdraw(int withdraw) {
		balance -= withdraw;
	}
	void deposit(int deposit) {
		balance += deposit;
	}
	
	// accessors
	int getId() {
		return id;
	}
	double getBalance() {
		return balance;
	}
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	double getAnnualInterest() {
		return balance * annualInterestRate/100;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	double getMonthlyInterest() {
		return balance * (annualInterestRate/1200) ;
	}
	String getDateCreated() {
		return dateCreated;
	}
	
	// set Annual Interest Rate method
	double setAnnualInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
		return annualInterestRate;
	}
}
