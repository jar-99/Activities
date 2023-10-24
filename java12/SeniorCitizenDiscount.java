package java12;

import java.util.Scanner;

public class SeniorCitizenDiscount {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your income: $");
        double income = scanner.nextDouble();

        if (age >= 60 && income < 10000) {
            System.out.println("Eligible for senior citizen discount");
        } else if (age >= 60 && income >= 10000) {
            System.out.println("Not eligible for senior citizen discount");
        } else {
            System.out.println("Not eligible for senior citizen discount");
        }
    }
}