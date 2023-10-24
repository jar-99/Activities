package java13;

import java.util.Scanner;

public class CharacterRepeater {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        char character;

        do {
            System.out.print("Enter a character: ");
            character = scanner.next().charAt(0);
            System.out.println("Entered character is: " + character);
        } while (character != 'q' && character != 'Q');

        System.out.println("Loop ended!");
    }
}