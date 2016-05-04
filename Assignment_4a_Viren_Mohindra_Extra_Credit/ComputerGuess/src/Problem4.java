import java.util.Random;
import javax.swing.JOptionPane;
public class Problem4 {

	public static void main(String[] args) {
	Random r = new Random();
	int sumGuess = 0; //keep track of guesses from all loops
	
	for (int i=0; i<1000; i++){
		int randomNumber = r.nextInt(100) + 1;
		int guessNumber = r.nextInt(100) + 1;
		
		int guessAmount = 1; //counter to keep track of guesses
		
		//variables to decrease guesses needed
		int lowestGuess = 0;
		int highestGuess = 0;
		boolean isLower = false;
		boolean isHigher = false;
		
		
		
		while (guessNumber != randomNumber){
			
			// if the guess number has been higher and lower than actual number, reduce range to be within highest and lowest values
			if (isLower && isHigher && highestGuess > lowestGuess){
				guessNumber = r.nextInt((highestGuess-lowestGuess)+1)+lowestGuess+1;
				if (guessNumber > randomNumber){
					highestGuess = guessNumber;
				}
				else if (guessNumber < randomNumber){
					lowestGuess = guessNumber;
				}
			}
			
			
			// if guess is lower, guess range removes lower values
			else if (randomNumber > guessNumber){
				lowestGuess = guessNumber;
				isLower = true;
				guessNumber = r.nextInt(100-guessNumber)+guessNumber+1;
				guessAmount += 1;
				
				
			}
			
			//if guess is higher, guess range removes higher values
			else if (randomNumber < guessNumber){
				highestGuess = guessNumber;
				isHigher = true;
				guessNumber = r.nextInt(guessNumber)+1;
				guessAmount += 1;
				
				
			}
			
		}
		
		sumGuess += guessAmount;	
	}
	JOptionPane.showMessageDialog(null, "Out of 1,000 games, it took an average of " + sumGuess/1000.0 + " tries to guess correctly.");
		

	}

}