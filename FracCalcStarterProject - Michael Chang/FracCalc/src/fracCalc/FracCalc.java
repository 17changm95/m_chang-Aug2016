package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Type in your input: ");
        String answer = console.next();//input separated by ' '
        
        produceAnswer(answer);
    	
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    public static String produceAnswer(String input) { 
        String firstOperand;
        String operator;
        String secondOperand;
        
        if (input.contains("+")) {
        	operator = "+";
        } else if (input.contains("-")) {
        	operator = "-";
        } else if (input.contains("/")) {
        	operator = "/";
        } else if (input.contains("*")) {
        	operator = "*";
        } else {
        	throw new IllegalArgumentException("Please include operator in input");
        }
        
        firstOperand = input.substring(0, input.indexOf(operator));
        secondOperand = input.substring(input.indexOf(operator) + 1);
        
    	return secondOperand;
    }
}
