package java5;

	import java.util.Scanner;

	public class TheGreaterOne {
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number:");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number:");
	        double num2 = scanner.nextDouble();

	        if (num1 > num2) {
	            System.out.println("Greater");
	        } else if (num1 < num2) {
	            System.out.println("Lesser");
	        } else {
	            System.out.println("Equal");
	        }
	    }
	}