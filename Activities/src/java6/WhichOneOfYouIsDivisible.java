package java6;

	import java.util.Scanner;

	public class WhichOneOfYouIsDivisible {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        if (num1 % num2 == 0) {
	            System.out.println("The first number is divisible by the second number.");
	        } else {
	            System.out.println("The first number is not divisible by the second number.");
	        }
	    }
	}