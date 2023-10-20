package java10;

import java.util.Scanner;

public class DoWhileLoopCounting {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.print("Please enter a positive integer.");
        } else {
            int i = 1;
            do {
                System.out.println(i);
                i++;
            } while (i <= n);
        }
    }
}