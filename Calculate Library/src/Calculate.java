/**
 * 
 */

/**
 * @author Michael Chang
 * Created 8/30/2016
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
		double answer = num * num;
		return answer;
	}
	
	public static double cube(double num){
		double answer = num * num * num;
		return answer;
	}
	
	public static double average(double num1, double num2){
		double answer = (num1 + num2)/2;
		return answer;
	}
	
	public static double average(double num1, double num2, double num3){
		double answer = (num1 + num2 + num3)/3;
		return answer;
	}
	
	public static double discriminant(double a, double b, double c){
		double answer = b * b - 4 * a * c;
		return answer;
	}
	
	public static String toImproperFrac(int whole, int numer1, int denom){
		int numer2 = denom * whole + numer1;
		String answer = numer2 + "/" + denom;
		return answer;
	}
	
	public static String toMixedNum(int numer1, int denom){
		int whole = numer1 / denom;
		int numer2 = numer1 % denom;
		String answer = whole + "_" + numer2 + "/" + denom;
		return answer;
	}
	
	public static String foil(int a, int b, int c, int d, String var){
		int firstCo = a * c;
		int secondCo = (a * d) + (b * c);
		int thirdCo = b * d;
		String op1;
		String op2;
		
		if (secondCo > 0) {
			op1 = " + ";
		} else if (secondCo < 0) {
			op1 = " - ";
		} else {
			op1 = "";
		}
		
		if (thirdCo > 0) {
			op2 = " + ";
		} else if (thirdCo < 0) {
			op2 = " - ";
		} else {
			op2 = "";
		}
		
		String answer = firstCo + var + "^2" + op1 + secondCo + var + op2 + thirdCo;
		return answer;
	}
	
	public static boolean isDivisibleBy(int dividend, int divisor) {
		if (dividend % divisor == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double absValue(double num) {
		if (num < 0) {
			return num * (-1);
		} else {
			return num;
		}
	}
	
	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	/*public static double max(double num1, double num2, double num3) {
		if ()
	}
	*/
	
	public static int min(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static double round(double num) {
		double numAdded = num + 0.005;
		double numMult = numAdded * 100;
		int numCasted = (int) numMult;
		double answer = (double) numCasted / 100.0;
		
		return answer;
	}
	
}