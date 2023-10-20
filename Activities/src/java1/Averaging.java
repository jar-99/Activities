package java1;

import java.util.Scanner;

public class Averaging {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
       
    	int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer : ");
            int number = scanner.nextInt();

            if (number == 0) {
                if (count == 0) {
                    System.out.println("Error: No inputs to calculate average");
                } else {
                    double average = (double) sum / count;
                    System.out.printf("Average: %.2f%n", average);
                }
                break;
            } else {
                sum += number;
                count++;
            }
        }

    }
}