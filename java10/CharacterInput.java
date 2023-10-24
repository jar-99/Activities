package java10;

import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        
    	String input;
        int count = 0;

        do {
            System.out.print("Enter a character: ");
            input = scanner.nextLine();
            
            if (input.length() == 1) {
                char c = input.charAt(0);
                if (Character.isUpperCase(c) && isVowel(c)) {
                    break;
                }
            }
            System.out.println(input);
            count++;
        } while (count < 5);

        System.out.println("End of program");
    }

    private static boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}