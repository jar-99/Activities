package java4;

import java.util.Scanner;

public class Multipliers {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        int product = x * y;
        System.out.println("Product: " + product);
    }
}