package java9;

import java.util.Scanner;

public class FlagControlledPracticeI {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter character: ");
        char input = scanner.next().charAt(0);

        while (input != 'S') {
            System.out.print("Enter character: ");
            input = scanner.next().charAt(0);
        }
    }
}