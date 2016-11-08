import java.util.Date;

public class DoMath {
	
	public static void main(String[] args) {
		testDoMath("testing square with 5", 25, Calculate.square(5));
		testDoMath("testing square with -2", 4, Calculate.square(-2));
		testDoMath("testing square with 5", 25, Calculate.square(5));
		testDoMath("testing average 2 numbers with 2 & 4", 3.0, Calculate.average(2.0,4.0));
		testDoMath("testing average 2 numbers with -5.0 & 5.0", 0.0, Calculate.average(-5.0, 5.0));
		testDoMath("testing average 3 numbers with -5, 2, 15", 4.0, Calculate.average(-2, 2, 15));
		testDoMath()
	}
	
}
