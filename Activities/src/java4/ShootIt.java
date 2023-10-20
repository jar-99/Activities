package java4;

import java.util.Scanner;

public class ShootIt {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x, y of a point: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x, y of the circle's center: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);

        if (distance <= radius) {
            System.out.println("Score! The ball went inside the circle.");
        } else {
            System.out.println("Sorry, try again next time. The ball did not go inside the circle.");
        }
    }

    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}