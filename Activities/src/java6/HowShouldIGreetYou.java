package java6;

import java.util.Scanner;

public class HowShouldIGreetYou {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gender: ");
        String gender = scanner.next();

        if (gender.equalsIgnoreCase("M")) {
            System.out.println("Welcome, sir!");
        } else if (gender.equalsIgnoreCase("F")) {
            System.out.println("Welcome, madam!");
        } else {
            System.out.println("Invalid input. Please enter 'M' for male or 'F' for female.");
        }

        scanner.close();
    }
}