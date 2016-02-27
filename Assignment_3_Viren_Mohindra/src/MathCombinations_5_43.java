/* Viren Mohindra
 * (Math: combinations)
 * Write a program that displays all possible combinations for picking two numbers from integers 1 to 7.
 * Also display the total number of all combinations.
 * 1 2
 * 1 3
 * ...
 * ...
 * The total number of all combinations is 21
 */

public class MathCombinations_5_43 {

	public static void main(String[] args) {
		int total = 0;
		
		for (int i=1; i < 8; i++) {
			for (int j=1; j<8; j++) {
				if (i<j) {
				System.out.println(i + " " + j);
				total++;
				}

			}			
		}
		
		System.out.println("The total number of all combinations is " + total);
	}

}

