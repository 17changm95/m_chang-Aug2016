/**
 * @author Michael Chang
 * @version 1.0
 * @since 11/5/2016
 * @classPeriod 1�
 */

import java.util.*;

public class Split {

	public static void main(String[] args) {
		
		SandwichSplitter("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		/*
		String likeApples1 = "I reallyreally like apples";
		String likeApples2 = "I really like really red apples";
		String someStatement = "Someone needs red to eat red my red cookies red eat haha red.";
		
		String[] array1 = likeApples1.split("really");
		String[] array2 = likeApples2.split("really");
		String[] array3 = someStatement.split("red");
		
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		*/
	}
	
	//Your task:
	/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
	 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
	 * What if it's a fancy sandwich with multiple pieces of bread?
	*/

	//Your task pt 2:
	/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
	 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
	 * Again, what if it's a fancy sandwich with multiple pieces of bread?
	*/

	public static void SandwichSplitter(String sandwich) {
		
		sandwich = "cookiesyum" + sandwich + "cookieslol"; //differentiates actual sandwich from stuff outside sandwich
				
		String[] topBread; //this is the first bread encountered
		
		//following statement looks for topBread under conditions there are spaces and under conditions where there aren't
		if (sandwich.contains(" bread ")) {
			topBread = sandwich.split(" bread ");
		} else if (sandwich.contains("bread")) {
			topBread = sandwich.split("bread");
		} else {
			topBread = null;
		}
		
		//the last bread to occur is bottomBread. bottomBread is yummy as topBread given both breads are of the same type, haha
		String[] bottomBread = new String[topBread.length];
		
		if (topBread.length > 2) {
			for(int i = 0; i < topBread.length; i++){
				bottomBread[i] = topBread[i] + ", ";
			}
			
			//midBread splits up the the existing arrays. accounts for multiple pieces of bread
			String[] midBread = Arrays.toString(bottomBread).split(", ");
			
			for(int j = 1; j <= bottomBread.length; j++){
				System.out.print(midBread[j]);
			}
			System.out.println();
		}
		else {
			System.out.println("you don't have a sandwich"); //no other way to console the heart and soul. 
		}
	}
}
