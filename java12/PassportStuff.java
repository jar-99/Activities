package java12;

import java.util.Scanner;

public class PassportStuff {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a passport? (1/0): ");
        int passport = scanner.nextInt();

        if (age >= 18 && passport == 1) {
            System.out.println("Eligible to travel");
        } else if (age < 18 && passport == 1) {
            System.out.println("Travel with guardian");
        } else if (age >= 18 && passport == 0) {
            System.out.println("Apply for a passport");
        } else {
            System.out.println("Not eligible to travel");
        }

    }
}