package java4;

import java.util.Scanner;

public class BabyAge {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the age of The Programmer	: ");
        int programmerAge = scanner.nextInt();
        
        System.out.print("Enter the age of Cody's teacher	: ");
        int teacherAge = scanner.nextInt();
        
        System.out.print("Enter the age of his friend, Peter : ");
        int peterAge = scanner.nextInt();
        
        int babyAge = (programmerAge * teacherAge) / peterAge + 1;
        System.out.println("The age of the baby is " + babyAge + ".");
    }
}