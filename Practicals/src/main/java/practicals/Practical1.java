package practicals;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practical1 {

	public static void main(String[] args) {

		Random rng = new Random();
		
		int[] numbers = new int[500];
		
		for(int i = 1; i <= 500; i++) {
			numbers[i-1] = rng.nextInt(10000);
			System.out.println("number " + i + ": " + numbers[i-1]);
		}
		
		Arrays.sort(numbers);
		
		for(int i = 1; i <= 500; i++) {
			System.out.println("number " + i + ": " + numbers[i-1]);
		}
		
		System.out.println("Select the Nth smallest number to display");
		
		try (Scanner input = new Scanner(System.in)) {
			int userInput = input.nextInt();
			
			if(0 < userInput && userInput < 501) {
				System.out.println(numbers[userInput-1]);
			} else {
				System.out.println("Error: that number is out of bounds");
			}
			
			
		}
		
		
		
	}

}
