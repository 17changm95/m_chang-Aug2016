/**
 * @author Michael Chang
 * @version 1.0
 * @since 8/30/2016
 *
 */
public class Calculate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static double square(double num){
		//method for squaring numbers
		double answer = num * num;
		return answer;
	}
	
	public static double cube(double num){
		//method for cubing numbers
		double answer = num * num * num;
		return answer;
	}
	
	public static double average(double num1, double num2){
		//method for taking the average of two numbers
		double answer = (num1 + num2)/2;
		return answer;
	}
	
	public static double average(double num1, double num2, double num3){
		//method for taking the average of three numbers
		double answer = (num1 + num2 + num3)/3;
		return answer;
	}
	
	public static double toDegrees(double angleMeasure){
		//converts radians to degrees
		double answer = angleMeasure * 180 / 3.14159;
		return answer;
	}
	
	public static double toRadians(double angleMeasure){
		//converts degrees to radians
		double answer = angleMeasure * 3.14159 / 180;
		return answer;
	}
	
	public static double discriminant(double a, double b, double c){
		//the discriminant formula. fun
		double answer = square(b) - 4 * a * c;
		return answer;
	}
	
	public static String toImproperFrac(int wholeNum, int numerator1, int denominator){
		//converting mixed numbers to improper fractions
		int numerator2 = denominator * wholeNum + numerator1;
		String answer = numerator2 + "/" + denominator;
		return answer;
	}
	
	public static String toMixedNum(int numerator1, int denominator){
		//converting improper fractions to mixed numbers
		int whole = numerator1 / denominator;
		int numerator2 = numerator1 % denominator;
		String answer = whole + "_" + numerator2 + "/" + denominator;
		return answer;
	}
	
	public static String foil(int a, int b, int c, int d, String var){
		//method for foiling
		int firstCoeff = a * c;
		int secondCoeff = (a * d) + (b * c);
		int thirdCoeff = b * d;
		String op1;
		String op2;
		
		// I found it necessary to use conditional statements below in order to make the plus and minus operators in the quadratic equation to reflect the sign of the coefficient.
		
		if (secondCoeff > 0) {
			op1 = "+";
		} else if (secondCoeff < 0) {
			op1 = "";
		} else {
			op1 = "";
		}
		
		if (thirdCoeff > 0) {
			op2 = "+";
		} else if (thirdCoeff < 0) {
			op2 = "";
		} else {
			op2 = "";
		}
		
		String answer = firstCoeff + var + "^2" + op1 + secondCoeff + var + op2 + thirdCoeff;
		return answer;
	}
	
	public static boolean isDivisibleBy(int dividend, int divisor) {
		//shows whether a number is divisible by another number. if dividend is less than divisor then modulo is 0 but shows it's not divisible. throws error if divisor is equal to 0.
		if (dividend % divisor == 0 && dividend > divisor) {
			return true;
		} else if (dividend % divisor ==  0 && dividend < divisor) {
			return false;
		} if (divisor == 0) throw new IllegalArgumentException("Undefined");
		else {
			return false;
		}
	}
	
	public static double absValue(double num) {
		//absolute value method. turns numbers into their absolute value!
		if (num < 0) {
			return num * (-1);
		} else {
			return num;
		}
	}
	
	public static int max(int num1, int num2) {
		//max method is overloaded. takes two numbers outputs the larger of the two.
		if (num1 > num2) {
			return num1;
		} 
		if (num2 > num1) {
			return num2;
		} else {
			return num1;
		}
	}
	
	public static double max(double num1, double num2, double num3) {
		//max method is overloaded. takes three numbers and outputs largest of three
		if (num1 > num2 && num1 > num3) {
			return num1;
		}
		if (num2 > num1 && num2 > num3) {
			return num2;
		}
		if (num3 > num1 && num3 > num2) {
			return num3;
		} else {
			return num1;
		}
	}	
	
	public static int min(int num1, int num2) {
		//finding minimum number from two numbers
		if (num1 < num2) {
			return num1;
		} else {
			return num1;
		}
	}
	
	public static double round2(double num) {
		//rounds number to the nearest hundredth work
		double numAdded = num + 0.005;
		double numMult = numAdded * 100;
		int numCasted = (int) numMult;
		double answer = (double) numCasted / 100.0;
		
		return answer;
	}
	
	public static double exponent(double num, int pwr) {
		//exponent method takes in double num and int pwr so to symbolize number and the power to number
		double newNum = 1;		
		if (num >= 0) {
			for (int i = 1; i <= pwr; i++) {
				newNum *= num;
			}
		} if (num < 0) throw new IllegalArgumentException("Not possible to make to the power of right now");
		return newNum;
	}
	
	public static int factorial(int num) {
		//factorial method
		int prevNum = num - 1;
		int answer = 0; //primed variable
		if (num <= 0) throw new IllegalArgumentException("Undefined");
		else {
		while (prevNum > 1) {
			num *= prevNum; // num = num * prevNum
			prevNum--;
			answer = num;
		}
		return answer;
		}
	}
	
	public static boolean isPrime(int dividend) {		
		//determines whether number is inefficient. well works for me
		int divisor = 2;
		boolean quotient = true; //primed
		
		dividend = (int) absValue(dividend);
		
		while (divisor < dividend) {
			if (isDivisibleBy(dividend, divisor) == false){
				divisor++;
			} else if (isDivisibleBy(dividend, divisor) == true) {
				return quotient = false;				
			} else {
				return quotient = true;
			}
		}
		return quotient;
	}
	
	public static int gcf(int a, int b) {
		// this method follows the Euclidean algorithm
		int num1 = 0;
		int num2 = 0;
		int answerOfMod = 0;
		
		num1 = max(a,b);
		//called max method
		num2 = min(a,b);
		//called min method
		//called in total two methods from calculate library
		
		while (num2 != 0) {
			answerOfMod = num1 % num2;
			num1 = num2;
			num2 = answerOfMod;
		}
		return num1;
	}
	
	public static double sqrt(double num) {
		//sqrt would like to clarify that somehow got quite slow at processing decimal numbers
		num = round2(num);
		double guess = 1.;
		double answer = 0;
		
		if (num < 0) throw new IllegalArgumentException("Imaginary number");
		else {
		while (square(answer) != num) {
			guess = ((double)guess + num/guess)/2;
			answer = round2(guess);
		}
		return answer;
		}	
	}
	
	public static String quadform (int a, int b, int c) {
		//quadratic formula method in a few minutes.
		double formPositive = round2((-(double) b + sqrt(discriminant(a, b, c))/(2. * a)));
		double formNegative = round2((-(double) b - sqrt(discriminant(a, b, c))/(2. * a)));
		
		double cForPositB = 0;
		double cForNegatB = 0;
		
		if (b < 0) {
			cForPositB = sqrt(c);
		} else {
			cForNegatB = -1 * sqrt(c);
		}
		
		String oneRootPosit = "The root is " + cForPositB + ".";
		String oneRootNegat = "The root is " + cForNegatB + ".";
		String twoRoots = "The roots are "+ formPositive + " and " + formNegative + ".";
		String error = "Error.";
		String none = "No real roots.";
		
		if (discriminant(a, b, c) < 0) {
			return none;
		} else if (discriminant(a, b, c) > 0) {
			return twoRoots;
		} else if (discriminant(a, b, c) == 0 && b < 0) {
			return oneRootNegat;
		} else if (discriminant(a, b, c) == 0 && b > 0) {
			return oneRootPosit;
		}
		else {
			return error;
		}
	}
}