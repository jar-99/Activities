package java9;

import java.util.Scanner;

public class CountdownWithAForLoop {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = n; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }
}