/* Viren Mohindra (Game: locker puzzle)
 * A school has 100 lockers and 100 students. All lockers are closed on the first day of school.
 * As the students enter, the first student, denoted S1, opens every locker.
 * Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker.
 * Student S3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed).
 * Student S4 begins with locker L4 and changes every fourth locker.
 * Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.
 * After all the students have passed through the building and changed the lockers, which lockers are open?
 * Write a program to find your answer and display all open locker numbers separated by exactly one space.
 * (Hint: Use an array of 100 Boolean elements, each of which indicates whether a locker is open (true) or closed (false).
 * Initially, all lockers are closed.)
 */

public class Lockers_7_23 {

	static int students = 100;
	
	public static void main(String[] args) {
		
	       boolean[] l = new boolean[100]; // 100 lockers

	        for (int i = 1; i <= students; i++) {
	            openClose(l, i);
	        }
	        System.out.print("The lockers are: "); print(l);
	    }

	    public static void openClose(boolean[] open,  int i) {
	        for (int j = i - 1; j < open.length; j += i) {
	                open[j] = !open[j];
	        }
	    }

	    public static void print(boolean[] l) {
	        int count = 0;
	        for (int i = 0; i < l.length; i++) {
	            if (l[i]) {
	                System.out.printf("L%d ", i+1);
	                count++;
	                if (count % 10 == 0) System.out.println("");
	            }
	        }
	    }
}