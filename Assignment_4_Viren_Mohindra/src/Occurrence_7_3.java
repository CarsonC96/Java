/* Viren Mohindra
 * (Count occurrence of numbers)
 * Write a program that reads the integers between 1 and 100 and counts the occurrences of each.
 * Assume the input ends with 0. Here is a sample run of the program:
 * 
 * Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
 * 2 occurs 2 times
 * 3 occurs 1 time
 * 4 occurs 1 time
 * 5 occurs 2 times
 * 6 occurs 1 time
 * 23 occurs 1 time
 * 43 occurs 1 time
 * 
 * Note that if a number occurs more than one time, the plural word “times” is used in the output.
 */

import java.util.*;

public class Occurrence_7_3 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100, and end the inputs with the number zero: ");
        int[][] n = new int[2][100];
        
        for (int i = 0; i < 100; i++) {
            int num = in.nextInt();
            
            if (num >= 100 || num <= 0) { // if number is out of scope
            	break;
            }

            n[0][i] = num;
            n[1][num] = n[1][num] + 1;
        }

        for (int i = 0; i < n[1].length; i++) {
        	
            if (n[1][i] == 0) {
            	continue; // on to the next iteration
            }
            if (n[1][i] > 1) {
            	System.out.println(i + " occurs " + n[1][i] + " times");
            }
            else {
            	System.out.println(i + " occurs " + n[1][i] + " time");
            }
        }
        
    in.close();
    }
}