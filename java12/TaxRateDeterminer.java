package java12;

import java.util.Scanner;

public class TaxRateDeterminer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        
        System.out.print("Enter the number of dependents: ");
        int dependents = scanner.nextInt();

        String taxRate;

        if (income <= 30000) {
            if (dependents == 0) {
                taxRate = "10% tax rate";
            } else {
                taxRate = "5% tax rate";
            }
        } else {
            if (dependents == 0) {
                taxRate = "20% tax rate";
            } else {
                taxRate = "15% tax rate";
            }
        }

        System.out.println(taxRate);
    }
}