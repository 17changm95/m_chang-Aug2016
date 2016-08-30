/*
 * @author Michael Chang
 * Temperature Converter
 * Version: 1.0, 8/29/2016
 * 
 * In the interest of time, I will not be adding temperature restrictions (i.e., absolute zero) to this converter.
 */

import java.util.Scanner;
public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char temp;
		float tempNum;
		
		Scanner input = new Scanner(System.in);
		// Creates new Scanner object. Declares input as variable representing Scanner object.
		
		System.out.print("Do you want to convert into Celsius or Fahrenheit [c or f]: ");
		temp = input.nextLine().charAt(0);
		
		System.out.print("Type in the temperature: ");
		tempNum = input.nextFloat();
		System.out.println();
		
		switch(temp) {
			case 'c' :
				System.out.printf("%.3f", 5./9. * (tempNum - 32.));
				break;
			
			case 'f' :
				System.out.printf("%.3f", 9./5. * tempNum + 32.);
				break;
				
			default:
                System.out.printf("You typed an invalid option");
		}
	}

}
