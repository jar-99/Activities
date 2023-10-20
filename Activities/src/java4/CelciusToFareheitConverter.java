package java4;

import java.util.Scanner;

public class CelciusToFareheitConverter {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        float celsius = scanner.nextFloat();
        
        float fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
    }

    private static float celsiusToFahrenheit(float celsius) {
        return celsius * (9f / 5f) + 32f;
    }
}