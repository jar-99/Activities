package java3;

import java.util.Scanner;

public class FinancialAnalysis {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Company Name: ");
        String companyName = scanner.nextLine();
        
        System.out.print("Enter Revenue	: ");
        double revenue = scanner.nextDouble();
        
        System.out.print("Enter Expenses	: ");
        double expenses = scanner.nextDouble();
        
        System.out.print("Enter Profit	: ");
        double profit = scanner.nextDouble();
        
        System.out.print("Enter Tax Rate	: ");
        double taxRate = scanner.nextDouble();
        
        System.out.println("\nCompany Name	: " + companyName);
        System.out.println("Revenue		: " + revenue);
        System.out.println("Expenses	: " + expenses);
        System.out.println("Profit		: " + profit);
        System.out.println("Tax Rate	: " + taxRate + "%");
    }
}