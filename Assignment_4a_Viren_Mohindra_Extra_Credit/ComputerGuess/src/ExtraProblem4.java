import java.util.Random;

public class ExtraProblem4 {

	public static void main(String[] args) {
		
		int runs = 15;
		int maximum = 100;
		int total = 0;
		double average;
		
		// For each iteration of the monte carlo simulation, we add the number of 
		// guesses required to guess the number, which is given by the trialRun 
		// method with the max value x of the range (0,x]
		for (int i = 0; i < runs; i++) {
			total += trialRun(maximum);
		}
		
		average = (double) total / runs;
		
		System.out.println("The average number of guesses is "+ average);	
		// This seems to average around 6, which makes sense because 7 is the ceiling
		// for how many guesses you should need - thinking in binary (i.e., if we went sequentially
		// through each bit to see if it was a one or a zero), we can find the answer within 7
		// questions because 2^7 = 128 > 100 (and as 100 > 64 = 2^6, 6 questions does not guarantee
		// a correct answer). The average will be lower than 7 because 7 is the upper ceiling
	}
	
	// this method performs a single trial run for a given maximum possible value
	// it continually updates the max and min based on comparisons made between the guess
	// value and the true value, and then makes another guess based on the updated max and min
	public static int trialRun(int max) {
		
		Random r = new Random();
		int min = 1;
		int number = r.nextInt(max) + 1;
		int guess = max / 2;
		int count = 1;
		
		do {
			if ((number == guess) || (count > 15)) {
				break;
			}
			else if (number < guess) {
				max = guess;
				guess = guess - (max - min) / 2 - 1;
			}
			else if (number > guess) {
				min = guess;
				guess = (max - guess) / 2 + guess;
			}
			count++;
		} while (!(guess == number));
		
		return count;
	}
}