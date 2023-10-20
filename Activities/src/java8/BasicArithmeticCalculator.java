package java8;

import java.util.Scanner;

public class BasicArithmeticCalculator {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an operator (+,-, *, /)	: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the first number	: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number	: ");
        double num2 = scanner.nextDouble();

        double output;

        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                output = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f\n", num1, operator, num2, output);
    }
}