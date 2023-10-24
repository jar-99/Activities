package java11;

import java.util.Scanner;

public class TheMathematicalSavant {

	public static void main(String[] args) {
	    
		int n;
	    System.out.print("Enter the number of elements: ");
	    
	    Scanner scanner = new Scanner(System.in);
	    n = scanner.nextInt();

	    int[] sequence = generateSequence(n);

	    System.out.println("The generated sequence is: ");
	    for (int num : sequence) {
	        System.out.print(num + " ");
	    }
	}

	private static int[] generateSequence(int n) {
	    int[] sequence = new int[n];
	    sequence[0] = 1;
	    sequence[1] = 3;
	    sequence[2] = 2;
	    sequence[3] = 5;

	    for (int i = 4; i < n; i++) {
	        sequence[i] = sequence[i - 3] + sequence[i - 1];
	    }

	    return sequence;
	}
}