/* Viren Mohindra
 * (Central city)
 * Given a set of cities, the central city is the city that has the shortest total distance to all other cities.
 * Write a program that prompts the user to enter the number of the cities and the locations of the cities (coordinates),
 * and finds the central city and its total distance to all other cities.
 * 
 * Enter the number of cities: 5
 * Enter the coordinates of the cities:
 * 2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
 * The central city is at (2.5, 5.0)
 * The total distance to all other cities is 60.81
 */

import java.util.*;

public class CentralCity_8_21 {

static int x = 0;
static int y = 1;
static int finalDistance = 2;

	public static void main(String[] args) {
		
		// input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of cities (max 10): ");
        int n = in.nextInt();
        double[][] p = new double[n][3];
	
        System.out.println("Enter the coordinates of the cities: ");
		for (int i=0; i < p.length; i++) {
	        for (int j = 0; j < p[i].length - 1; j++)
	            p[i][j] = in.nextDouble();
		}

		// calculate center
		double[] central = calculateCenter(p);

		System.out.println("The central city is at (" + central[x] + "," + central[y] + ")");
		System.out.println("The total distance to all other cities is " + (float)central[finalDistance]);
		
		
		in.close();
	}

	public static double[] calculateCenter(double[][] points) {

	    for (int i = 0; i < points.length; i++) {

	        for (int j = 0; j < points.length; j++) {

	            if (j != i) {
	                points[i][finalDistance] += displacement(points[i][x], points[i][y], points[j][x],points[j][y]);
	            }
	        }
	    }

	    double[] central = points[0];
	    for (int i = 1; i < points.length; i++) {

	        if (points[i][finalDistance] < central[finalDistance]) {
	            central = points[i];
	        }
	    }

	    return central;

	}
	
	public static double displacement (double x1, double y1, double x2, double y2) {
	    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}


