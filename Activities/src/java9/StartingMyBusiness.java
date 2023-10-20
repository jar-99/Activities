 package java9;

 import java.util.Scanner;

 public class StartingMyBusiness {
     public static void main(String[] args) {
    	 
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a string: ");
         String inputString = scanner.nextLine();

         for (int i = 0; i < inputString.length(); i++) {
             char character = inputString.charAt(i);
             if (Character.isUpperCase(character)) {
                 System.out.println("Capital " + character + " found at index " + i);
                 break;
             }
         }
     }
 }