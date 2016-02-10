import javax.swing.*;

public class Numbers {
	
	public static void main(String[] args) {
		
		
		String age1, age2, age3;
		
		age1 = JOptionPane.showInputDialog("Enter the first number:");
		age2 = JOptionPane.showInputDialog("Enter the second number:");
		age3 = JOptionPane.showInputDialog("Enter the third number:");
		
		int num1, num2, num3;
		
		num1 = Integer.parseInt(age1);
		num2 = Integer.parseInt(age2);
		num3 = Integer.parseInt(age3);
		
		
		double avg = (double) (num1 + num2 + num3) / 3;
		
		
		String outavg;
		outavg = Double.toString(avg);
		JOptionPane.showMessageDialog(null, "The first number is " + num1 + ". The second number is " + num2 + ". And the last number is " + num3 + ". The average is " + outavg);
		
		
	}
}