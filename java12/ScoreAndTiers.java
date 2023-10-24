package java12;

import java.util.Scanner;

public class ScoreAndTiers {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        
        System.out.print("Enter your membership level (Bronze, Silver, Gold): ");
        String membershipLevel = scanner.next();

        if (score < 100) {
            System.out.println("No rewards");
        } else if (score >= 100 && score <= 500) {
            if (membershipLevel.equalsIgnoreCase("Bronze") ||
                membershipLevel.equalsIgnoreCase("Silver") ||
                membershipLevel.equalsIgnoreCase("Gold")) {
                System.out.println("Bronze rewards");
            } else {
                System.out.println(membershipLevel + " rewards");
            }
        } else if (score > 500 && score <= 1000) {
            if (membershipLevel.equalsIgnoreCase("Silver") ||
                membershipLevel.equalsIgnoreCase("Gold")) {
                System.out.println("Silver rewards");
            } else {
                System.out.println(membershipLevel + " rewards");
            }
        } else if (score > 1000) {
            if (membershipLevel.equalsIgnoreCase("Gold")) {
                System.out.println("Gold rewards");
            } else {
                System.out.println(membershipLevel + " rewards");
            }
        }
    }
}