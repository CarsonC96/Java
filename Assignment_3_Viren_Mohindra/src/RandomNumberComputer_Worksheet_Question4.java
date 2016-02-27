/* Viren Mohindra
 * 4. For problem 3, write a program that also generates guesses,
 * then based on the answer, generates another “good” guess,
 * meaning still in the range of allowable values. Play 1000 games,
 * and see if the number of guesses equals the expected mathematical number.
 */

import java.util.*;

public class RandomNumberComputer_Worksheet_Question4 {
	public static double total = 0;
	public static int count = 0;
	public static void main(String[] args) {
		
		Random r = new Random();
		int random = r.nextInt(100) + 1; // 100 maximum, 1 lowest
		int rGuess = r.nextInt(100) + 1; //same range limits as game
		int upperBound = 100;
		int lowerBound = 1;
		
		
		
		for (int i=0; i <=1000;) {
			
			if (rGuess == random) {
				++count;
				total+= count;
				count = 0;
				i++;
				
				// restart the game board
				random = r.nextInt(100) + 1;
				rGuess = r.nextInt(100) + 1;
				upperBound = 100;
				lowerBound = 1;
			}
			if (rGuess > random) {
				count++;
				upperBound = rGuess - 1;
				rGuess = r.nextInt(upperBound - lowerBound + 1) + lowerBound;
			}
			if (rGuess < random) {
				count++;
				lowerBound = rGuess + 1;
				rGuess = r.nextInt(upperBound - lowerBound + 1) + lowerBound;
			}
		}
		double avg = total/1000;
		double probability = 7.4; //approximate average number of tries to guess from 1-100 with 2^7 as a base
		System.out.println("Average number of tries from 1000 games were " + avg);
		System.out.println("Expected Mathematical number of tries from 1000 games are around " + probability);
		
		if (avg > probability) {
			System.out.println("Computer is slacking.");
		}
		if (avg < probability) {
			System.out.println("Computer is working hard.");
		}
		if (avg == probability) {
			System.out.println("Expected output.");
		}
	}

}
