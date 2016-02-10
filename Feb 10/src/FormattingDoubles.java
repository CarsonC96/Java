import javax.swing.JOptionPane;


public class FormattingDoubles {

	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Are you happy?");

		/*
		int num = 5;
		System.out.printf("%5d", num);
		System.out.println();
		System.out.printf("%10d", num);
		System.out.println();
		System.out.printf("%15d", num);
		System.out.println();
		*/
		
		if (option == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "That's nice!");
		}
		else if (option == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Don't be sad :(");
		}
	}

}
