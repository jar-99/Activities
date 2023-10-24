package java10;

import java.util.Scanner;

public class GatheringPositivity {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	
        int total = 0;
        int num;

        do {
            System.out.print("Enter n: ");
            num = scanner.nextInt();
            if (num > 0) {
                total += num;
            }
        } while (num != 0);

        System.out.println("The total of all inputted positive integers is: " + total);
    }
}