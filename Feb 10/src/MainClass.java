import javax.swing.*;


public class MainClass {

	public static void main(String[] args) {

		int year;
		String desc;
		year = 2018;
		
		switch (year) {
	
		case 2016: desc = "senior";
		break;
		case 2017: desc = "junior";
		break;
		case 2018: desc = "sophomore";
		break;
		case 2019:desc = "freshman";
		break;
		default: desc = "other";
		}
		
		JOptionPane.showMessageDialog(null, "Year is " + desc);
		
	}

}
