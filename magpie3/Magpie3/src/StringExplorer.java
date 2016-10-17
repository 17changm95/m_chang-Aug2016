
public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";
		String sample2 = "I need the cable and the lamp.";
		
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println("sample.indexOf(\"quick\") = " + position);
		
		// Variation of the indexOf method in that one may specify starting point other than 0 to search for first instance of string or character.
		int variablePosition = sample2.indexOf("the", 10);
		System.out.println("sample2.indexOf(\"the\") = " + variablePosition);

		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);

		// Try other methods here:

	}

}