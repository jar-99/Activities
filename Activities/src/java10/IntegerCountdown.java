package java10;

import java.util.Scanner;

public class IntegerCountdown {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            do {
                System.out.print(number + " ");
            } while (number-- > 0);
        } else if (number < 0) {
            do {
                System.out.print(number + " ");
            } while (number++ < 0);
        } else {
            System.out.println(number);
        }
    }
}