package java11;

import java.util.Scanner;

	public class CountingNum {
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a digit (0-9): ");
	        int digit = scanner.nextInt();
	        
	        System.out.print("Enter a non-zero positive integer: ");
	        int number = scanner.nextInt();

	        if (digit >= 0 && digit <= 9 && number > 0) {
	            int count = countDigit(digit, number);
	            System.out.println("Occurences " + count + ".");
	        } else {
	            System.out.println("Invalid input. Please ensure the digit is between 0 and 9 and the number is a non-zero positive integer.");
	        }

	    }

	    public static int countDigit(int digit, int number) {
	        int count = 0;
	        while (number > 0) {
	            if (number % 10 == digit) {
	                count++;
	            }
	            number /= 10;
	        }
	        return count;
	    }
	}