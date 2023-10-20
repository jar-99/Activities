package java4;

import java.util.Scanner;

public class ProductFromWithin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 2-digit integer: ");
        int number = scanner.nextInt();

        int firstDigit = number / 10;
        int secondDigit = number % 10;

        int product = firstDigit * secondDigit;

        System.out.println("Product of " + firstDigit + " and " + secondDigit + " = " + product);
    }
}