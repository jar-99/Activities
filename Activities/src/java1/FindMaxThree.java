package java1;

import java.util.Scanner;

public class FindMaxThree {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer	: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int y = scanner.nextInt();
        
        System.out.print("Enter the third integer	: ");
        int z = scanner.nextInt();

        int maxNumber = findMax(x, y, z);
        System.out.println("The greatest number is " + maxNumber);
    }

    public static int findMax(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }
}