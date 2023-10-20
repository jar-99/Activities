package java4;

import java.util.Scanner;

public class ParentheticalComplexity {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a	: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter b	: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter c	: ");
        int c = scanner.nextInt();
        
        System.out.print("Enter d	: ");
        int d = scanner.nextInt();
        
        int result = (a + b) * (c + d);
        System.out.println("(" + a + " + " + b + ") * (" + c + " + " + d + ") = " + result);

}
}