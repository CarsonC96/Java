import javax.swing.JOptionPane;
import java.util.Random;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalGuess = 0;
		Random r = new Random();
		for (int i=1;i<=1000;i++) {
			
			
			int num = r.nextInt(100) + 1;
			
			 
			int rand = r.nextInt(100) + 1;
			int guess = rand;
			
			int marker = 100;
			
			int counter = 1;
			
			while (guess != num) {
				if (guess > num) {
					marker = guess;
					guess = (guess / 2);
				}
				else {
					if ((guess+marker)%2==0) {
						guess = (guess + marker) / 2;
					}
					else {
						guess = (guess + marker) / 2 + 1;
					}
				}
				counter = counter + 1;
			}
			totalGuess = totalGuess + counter;
			
		}
		double avg = (double) totalGuess / 1000;
		JOptionPane.showMessageDialog(null, "Average guess is " + avg);
	}

}
