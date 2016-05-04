/* Viren Mohindra
 * (Sort ArrayList)
 * Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)
 * */

import java.util.*;

public class SortArrayList_13_3 {
	static int MAX = 50;

	public static void main(String[] args) {
		
		ArrayList<Number> list = new ArrayList<>();

		Random r = new Random();
		
        for (int i = 0; i < MAX; i++) {
            list.add(i + r.nextInt(99) + 1);
        }
        
		System.out.println("Shuffled Array List: " + list.toString());

		sort(list);
		System.out.println("\nSorting, please wait...\n");
	
		System.out.println("Sorted Array List:   " + list.toString());
	}

	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
	
			Number min = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			} 
		}
	}
}