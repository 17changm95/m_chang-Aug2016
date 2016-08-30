/**
 * @author Michael Chang
 * Created 8/30/2016
 *
 */

import java.util.Scanner;
public class DoMath {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		char op;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Operation [s=square , c=cube, a=average]: ");
		op = input.nextLine().charAt(0);
		
		System.out.print("Number: ");
		num = input.nextFloat();
		
		switch(op) {
			case 's':
				System.out.printf("%.3f", Calculate.square(num));
			break;
			
			case 'c':
				System.out.printf("%.3f", Calculate.cube(num));
			break;
			
			default:
				System.out.printf("You have entered invalid values.");
		}
		
	}

}
