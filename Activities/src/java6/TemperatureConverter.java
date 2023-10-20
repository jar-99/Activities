package java6;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        System.out.print("Enter 1 to convert to Celsius or 2 to convert to Kelvin: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("The temperature in Celsius is: " + celsius);
                break;
            case 2:
                double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
                System.out.println("The temperature in Kelvin is: " + kelvin);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }
    }
}