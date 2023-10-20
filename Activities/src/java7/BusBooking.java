package java7;

import java.util.Scanner;

public class BusBooking {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to Bus Ticketing Service!");

        while (true) {
            System.out.println("\nPlease choose a bus company: ");
            System.out.println("1. Victory Liner");
            System.out.println("2. Five Star Bus");
            System.out.println("3. Philtranco");
            System.out.print("Enter your choice: ");

            int busCompany = scanner.nextInt();

            if (busCompany == 1) {
                bookTicket(scanner, "Victory Liner");
            } else if (busCompany == 2) {
                bookTicket(scanner, "Five Star Bus");
            } else if (busCompany == 3) {
                    bookTicket(scanner, "Philtranco");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        }
    


    private static void bookTicket(Scanner scanner, String busCompany) {
        System.out.println("\nPlease choose a destination: ");
        System.out.println("1. Baguio");
        System.out.println("2. Pangasinan");
        System.out.println("3. Liloan, Southern Leyte");
        System.out.println("4. Ormoc");
        System.out.println("5. Tacloban");
        System.out.print("Enter your choice: ");
        int destination = scanner.nextInt();

        System.out.print("Enter the number of seats: ");
        int numberOfSeats = scanner.nextInt();

        int totalCost = 0;

        switch (destination) {
            case 1:
                totalCost = 800 * numberOfSeats;
                break;
            case 2:
                totalCost = 750;
                break;
}
}
}