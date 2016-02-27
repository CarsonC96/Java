/*Viren Mohindra
 * (Perfect number)
 * A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors,
 * excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1.
 * There are four perfect numbers less than 10,000.
 * Write a program to find all these four numbers.
 */

public class PerfectNumber_5_33 {
	
	static int divisorSum = 0;
	static int count = 0;
	
	
	public static void main(String[] args) {
		
		isPerfectNumber(10000);
		 System.out.println("Total number of perfect numbers less than 10,000 are " + count);
		}
	
	public static int isPerfectNumber(int max) {
	  for (int i = 1; i <= max; i++) {
		   for (int j = 1; j < i; j++) {
		    if (i % j == 0) {
		     divisorSum += j;
		    }
		   }
		   if (divisorSum == i) {
		    System.out.println(i + " is a perfect number");
		    count++;
		   }
		   divisorSum = 0;
		  }
	return count;
}

}
