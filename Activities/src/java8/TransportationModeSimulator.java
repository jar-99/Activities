package java8;

import java.util.Scanner;

public class TransportationModeSimulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the transportation mode: ");
        String mode = scanner.nextLine();

        switch (mode) {
            case "Car":
                System.out.println("Suggestion: Consider traffic conditions");
                break;
            case "Bicycle":
                System.out.println("Suggestion: Wear a helmet");
                break;
            case "Autobus":
                System.out.println("Suggestion: Check autobus schedules");
                break;
            case "Walk":
                System.out.println("Suggestion: Wear comfortable shoes");
                break;
            default:
                System.out.println("Invalid transportation mode entered.");
                break;
        }
    }
}