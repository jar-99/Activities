package java6;

import java.util.Scanner;

public class SquareOrTriangle {
	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the shape(Square or Triangle)	: ");
	    String shape = scanner.next();

	    if (shape.equalsIgnoreCase("Square")) {

	        System.out.print("Enter the side length				: ");
	        double side = scanner.nextDouble();

	        double area = side * side;

	        System.out.printf("The area of the square is: %.2f", area);

	    } else if (shape.equalsIgnoreCase("Triangle")) {

	        System.out.print("Enter the base length			: ");
	        double base = scanner.nextDouble();

	        System.out.print("Enter the height			: ");
	        double height = scanner.nextDouble();

	        double area = 0.5 * base * height;

	        System.out.printf("The area of the triangle is: %.2f", area);

	    } else {

	        System.out.println("Invalid input. Please enter either 'Square' or 'Triangle'.");

	    }

}
}