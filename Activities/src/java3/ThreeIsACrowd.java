package java3;

import java.util.Scanner;

public class ThreeIsACrowd {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        char firstCharacter = scanner.next().charAt(0);

        System.out.print("Enter the second character: ");
        char secondCharacter = scanner.next().charAt(0);

        System.out.print("Enter the third character: ");
        char thirdCharacter = scanner.next().charAt(0);

        System.out.println("\nThe characters in order are:\n" + firstCharacter + "\n" + secondCharacter + "\n" + thirdCharacter);
    }
}