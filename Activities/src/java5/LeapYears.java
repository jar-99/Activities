package java5;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        if (isLeapYear(year)) {
            System.out.println("Year is a leap year.");
        } else {
            System.out.println("Year is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}