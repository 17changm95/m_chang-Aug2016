/**
 * 
 */

/**
 * @author Michael Chang
 * @version 1.0
 * @since 10/2/2016
 *
 */
import java.util.*;
public class ProcessingNumbers {

	/**
	 * @param args
	 */
	/*
	 * Objectives:
	 * 1. Accepts as user input a string of numbers
	 * 2. Prints the smallest and largest of all numbers supplied by the user
	 * 3. Print the sum of all the even numbers the user typed, along with the largest even number typed.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		int min;
		Scanner console = new Scanner(System.in);
		int totalEven = 0;
		int maxEven = 0;
		
		System.out.print("How many numbers would you like to input? ");
		int totalNum = console.nextInt();
		
		System.out.print("What is your first number? ");
		int firstNum = console.nextInt();
		
		max = firstNum;
		min = firstNum;
		
		if (firstNum % 2 == 0 && firstNum > maxEven) {
			totalEven = firstNum;
			maxEven = firstNum;
		}
		
		for (int term = 0; term < totalNum - 1; term++) {
			System.out.print("What is your next number? ");			
			int nextNum = console.nextInt();
			
			if (nextNum > max) {
				max = nextNum;
			} else if (nextNum < min) {
				min = nextNum;
			}
			if (nextNum % 2 == 0) {
				totalEven += nextNum;
			}
			if (nextNum % 2 == 0 && nextNum > maxEven) {
				maxEven = nextNum;
			}
		}
			
			System.out.println("\nThe largest number is "+ max);
			System.out.println("The smallest number is " + min);
			System.out.println("The sum of all even numbers is " + totalEven);
			System.out.println("The largest even number is " + maxEven);
	}
}