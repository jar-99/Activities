package java13;

import java.util.Scanner;

public class BreakQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number:");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number:");
        int end = scanner.nextInt();
        
        System.out.print("Enter the max number:");
        int max = scanner.nextInt();

        int runningSum = 0;
        for (int i = start; i <= end; i++) {
            runningSum += i;
            if (runningSum >= max) {
                break;
            }
            System.out.println(runningSum);
        }

    }
}