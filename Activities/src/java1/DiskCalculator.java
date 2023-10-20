package java1;

import java.util.Scanner;

public class DiskCalculator {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the disk size		: ");
        int diskSize = scanner.nextInt();
        
        System.out.print("Enter the number of bytes	: ");
        int bytesToStore = scanner.nextInt();

        int minDisks = (int) Math.ceil((double) bytesToStore / diskSize);  
        System.out.print("Minimum number of disks: " + minDisks);

    }
}
