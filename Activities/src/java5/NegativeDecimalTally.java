package java5;

import java.util.Scanner;

public class NegativeDecimalTally {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();

        System.out.print("Enter the fourth number: ");
        double fourthNumber = scanner.nextDouble();

        double negativeSum = calculateNegativeSum(firstNumber, secondNumber, thirdNumber, fourthNumber);

        System.out.println("The sum of all negative numbers is: " + negativeSum);
    }

    private static double calculateNegativeSum(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {
        double sum = 0;

        if (firstNumber < 0) {
            sum += firstNumber;
        }

        if (secondNumber < 0) {
            sum += secondNumber;
        }

        if (thirdNumber < 0) {
            sum += thirdNumber;
        }

        if (fourthNumber < 0) {
            sum += fourthNumber;
        }

        return Math.round(sum * 100.0) / 100.0;
    }
}