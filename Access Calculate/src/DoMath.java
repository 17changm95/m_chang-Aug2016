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
		/*float num;
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
		} */
		
		//System.out.println(Calculate.square(4));
		//System.out.println(Calculate.cube(4));
		//System.out.println(Calculate.absValue(-95));
		//System.out.println(Calculate.average(4, 8));
		//System.out.println(Calculate.average(34, 56, 87));
		//System.out.println(Calculate.discriminant(5, 8, 9));
		//System.out.println(Calculate.foil(1, -7, -8, 8, "n"));
		//System.out.println(Calculate.isDivisibleBy(9, 2));
		//System.out.println(Calculate.max(5, 89));
		//System.out.println(Calculate.min(4, 78));
		//System.out.println(Calculate.toImproperFrac(9, 5, 8));
		//System.out.println(Calculate.toMixedNum(9, 3));
		System.out.println(Calculate.round2(99.4567));
		System.out.println(Calculate.max(-9785, 1342, 123));
		System.out.println(Calculate.max(123, 134, 156));
		System.out.println(Calculate.max(123, 123, 123));
		System.out.println(Calculate.exponent(2, 3));
	}

}
