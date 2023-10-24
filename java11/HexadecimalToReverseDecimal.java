package java11;

import java.util.Scanner;

	public class HexadecimalToReverseDecimal {
		public static void main(String[] args) {
			
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a hexadecimal number: ");
	        
	        String hexadecimal = scanner.next();
	        int decimal = hexadecimalToDecimal(hexadecimal);
	        int reversedDecimal = reverseDecimal(decimal);
	        
	        System.out.println("Reversed decimal equivalent: " + reversedDecimal);
	    }

	    private static int hexadecimalToDecimal(String hexadecimal) {
	        int decimal = 0;
	        for (int i = 0; i < hexadecimal.length(); i++) {
	            char current = hexadecimal.charAt(i);
	            int digit = Character.isDigit(current) ? Character.getNumericValue(current) : 10 + Character.toLowerCase(current) - 'a';
	            decimal = decimal * 16 + digit;
	        }
	        return decimal;
	    }

	    private static int reverseDecimal(int decimal) {
	        int reversed = 0;
	        while (decimal > 0) {
	            int digit = decimal % 10;
	            reversed = reversed * 10 + digit;
	            decimal /= 10;
	        }
	        return reversed;
	    }
	}