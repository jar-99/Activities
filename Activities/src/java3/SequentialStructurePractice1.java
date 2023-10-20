package java3;

import java.util.Scanner;

public class SequentialStructurePractice1 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tell me your name	: ");
        String name = scanner.nextLine();
        
        System.out.print("Your age		: ");
        int age = scanner.nextInt();

        System.out.println("Name		: " + name + ", Age: " + age);
    }
}