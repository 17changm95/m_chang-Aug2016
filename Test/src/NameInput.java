import java.util.Scanner;

public class NameInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner user_input = new Scanner(System.in);
				// The above statement creates a new Scanner object.
				
				System.out.print("Enter your first name: ");
				String first_name = user_input.next();
				
				// the above prompts user to input text
				
				System.out.print("Enter your surname: ");
				String surname = user_input.next();
				
				// more input text
				
				String full_name;
				full_name = first_name + " " + surname;
				
				/*here a variable full_name is declared. it is a string concatenation of the variables first_name and surname*/
				
				System.out.println("You are " + full_name);
				//prints out the string concatenation of text and your inputted text
	}

}
