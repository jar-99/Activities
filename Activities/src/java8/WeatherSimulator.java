package java8;

import java.util.Scanner;

public class WeatherSimulator {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the weather condition: ");
        String weatherCondition = scanner.nextLine();

        switch (weatherCondition) {
            case "Sunny":
                System.out.println("Suggestion: Enjoy the sunshine");
                break;
            case "Cloudy":
                System.out.println("Suggestion: Stay indoors");
                break;
            case "Rainy":
                System.out.println("Suggestion: Bring an umbrella");
                break;
            case "Windy":
                System.out.println("Suggestion: Fly a kite");
                break;
            default:
                System.out.println("Invalid weather condition");
                break;
        }

    }
}