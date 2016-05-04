import java.util.Random;

public class WordProblem4 {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 1000; i++) {
		Random r = new Random();
		int rand = r.nextInt(100) + 1;
		int guess, guess1 = 0;
		int lower = 0;
		int upper = 101;
		guess = r.nextInt(100) + 1;
		int counter = 1;
		if (guess == rand) {
			guess1 = guess;
		} else {
			do{
			if (guess > rand) {
			guess1 = r.nextInt(guess - lower);
			upper = guess;
			guess = guess1;
			//System.out.println(guess1);
			} else {
			guess1 = r.nextInt((upper - guess)) + guess;
			lower = guess;
			guess = guess1;
			//System.out.println(guess1);
			}
			counter += 1;
			} while (guess != rand); 
			
		total = total + counter;
		//System.out.println(counter);
		//System.out.print("\n");
		}
		}
		System.out.println("average is " + total/1000.0);
	}
}


