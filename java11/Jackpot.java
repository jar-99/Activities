package java11;

import java.util.Scanner;

public class Jackpot {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 3-digit integer: ");
        int number = scanner.nextInt();

        System.out.print("Enter the digit to be searched (0 - 9): ");
        int digit = scanner.nextInt();

        if (isJackpot(number, digit)) {
            System.out.println("Jackpot!");
        } else {
            System.out.println("Nah");
        }

    }

    public static boolean isJackpot(int number, int digit) {
        int num1 = number / 100;
        int num2 = number / 10 % 10;
        int num3 = number % 10;

        return num1 == digit && num2 == digit && num3 == digit;
    }
}