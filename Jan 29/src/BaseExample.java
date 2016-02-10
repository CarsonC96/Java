import javax.swing.*;

public class BaseExample {

	public static void main(String[] args) {
		
		String inage;
		inage = JOptionPane.showInputDialog("Enter age");
		int age;

		age = Integer.parseInt(inage);
		age = age + 10;
		
		String outage;
		outage = Integer.toString(age);
		
		JOptionPane.showMessageDialog(null, "In 10 years your age will " + "be " + outage);

	}

}