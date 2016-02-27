/* Viren Mohindra
 * (Display calendars)
 * Write a program that prompts the user to enter the year and first day of the year
 * and displays the calendar table for the year on the console.
 * For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 * your program should display the calendar for each month in the year, as follows:
 */

import java.util.Scanner;

public class Calendar_5_29 {
	
	public static int firstDay;
	
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter full year (e.g., 2001): ");
    int year = in.nextInt();

    System.out.print("Enter first day of the year (0 being Sunday, 1 being Monday, etc): ");
    int firstDayOfMonth = in.nextInt();

    for (int i=0; i>=12; i++) {
        printCalendar(year, firstDayOfMonth);
    } 
    in.close();
  }

  static void printCalendar(int year, int firstDayOfMonth) {
    // Print the headings of the calendar
    printMonthTitle(year, firstDayOfMonth);

    // Print the body of the calendar
    printMonthBody(year, firstDayOfMonth);
  }


  static void printMonthTitle(int year, int month) {
    System.out.println("         " + getMonthName(month)
      + " " + year);
    System.out.println("-----------------------------");
    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
  }


  static String getMonthName(int month) {
    String monthName = null;
    switch (month) {
      case 1: monthName = "January"; break;
      case 2: monthName = "February"; break;
      case 3: monthName = "March"; break;
      case 4: monthName = "April"; break;
      case 5: monthName = "May"; break;
      case 6: monthName = "June"; break;
      case 7: monthName = "July"; break;
      case 8: monthName = "August"; break;
      case 9: monthName = "September"; break;
      case 10: monthName = "October"; break;
      case 11: monthName = "November"; break;
      case 12: monthName = "December"; break;
    }

    return monthName;
  }
  
  static String getDate(int firstDayOfMonth) {
	    String day = null;
	    switch (firstDayOfMonth) {
	      case 0: day = "Sunday"; break;
	      case 1: day = "Monday"; break;
	      case 2: day = "Tuesday"; break;
	      case 3: day = "Wednesday"; break;
	      case 4: day = "Thursday"; break;
	      case 5: day = "Friday"; break;
	      case 6: day = "Saturday"; break;
	    }

	    return day;
	  }

  static void printMonthBody(int year, int month) {
    // Get start day of the week for the first date in the month

    // Get number of days in the month
    int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

    // Pad space before the first day of the month
    int i = 0;
    for (i = 0; i < firstDay; i++)
      System.out.print("    ");

    for (i = 1; i <= numberOfDaysInMonth; i++) {
      if (i < 10)
        System.out.print("   " + i);
      else
        System.out.print("  " + i);

      if ((i + firstDay) % 7 == 0)
        System.out.println();
    }

    System.out.println();
  }


  /** Get the total number of days since January 1, 1800 */
  static int getTotalNumberOfDays(int year, int month) {
    int total = 0;

    // Get the total days from 1800 to 1/1/year
    for (int i = 1800; i < year; i++)
      if (isLeapYear(i))
        total = total + 366;
      else
        total = total + 365;

    // Add days from Jan to the month prior to the calendar month
    for (int i = 1; i < month; i++)
      total = total + getNumberOfDaysInMonth(year, i);

    return total;
  }

  /** Get the number of days in a month */
  static int getNumberOfDaysInMonth(int year, int month) {
    if (month == 1 || month == 3 || month == 5 || month == 7 ||
      month == 8 || month == 10 || month == 12)
      return 31;

    if (month == 4 || month == 6 || month == 9 || month == 11)
      return 30;

    if (month == 2) return isLeapYear(year) ? 29 : 28;

    return 0; // If month is incorrect
  }

  /** Determine if it is a leap year */
  static boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
}