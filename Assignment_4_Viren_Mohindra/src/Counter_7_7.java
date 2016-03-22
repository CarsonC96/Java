/* Viren Mohindra
 * (Count single digits)
 * Write a program that generates 100 random integers between 0 and 9 and displays the count for each number.
 * (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class Counter_7_7 {
	
	public static void main(String[] args) {
		
		int[] r = new int[100];
		int[] counts = new int[10];
		
		for (int i = 0; i < r.length; i++) {
			int n = (int)(Math.random() * 10);
			r[i] = n;
			counts[n]++;
	        System.out.print(r[i] + " ");
	        if ((i + 1) % 10 == 0) System.out.println("");
		}


    System.out.println("_____________________");
    for (int i = 0; i < counts.length; i++) {
        System.out.println("Occurrences for "+ i + " = " + counts[i] + " times.");
    }
  }
}