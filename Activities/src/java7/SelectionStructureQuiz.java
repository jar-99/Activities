package java7;

import java.util.Scanner;

public class SelectionStructureQuiz {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        String result = "Number is divisible by ";

        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if (divisibleBy2 && divisibleBy3 && divisibleBy5) {
            result += "{2, 3, 5}";
        } else if (divisibleBy2 && divisibleBy3) {
            result += "(2, 3)";
        } else if (divisibleBy2 && divisibleBy5) {
            result += "(2, 5)";
        } else if (divisibleBy3 && divisibleBy5) {
            result += "(3, 5)";
        } else if (divisibleBy2) {
            result += "{2}";
        } else if (divisibleBy3) {
            result += "{3}";
        } else if (divisibleBy5) {
            result += "{5}";
        } else {
            result += "none";
        }

        System.out.println(result);
    }
}