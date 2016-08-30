import java.util.Scanner;

public class TestInputThings {
    public static void main(String[] args) {
        float number1, number2;
        char operator;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Choose the math operation [+ - * / ]: ");
        operator = input.nextLine().charAt(0);
        
        System.out.print("Type the first number: ");
        number1 = input.nextFloat();
        System.out.print("Type the second number: ");
        number2 = input.nextFloat();
        System.out.println();
        
        switch( operator )
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", number1, number2, number1 + number2);
                break;        
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", number1, number2, number1 - number2);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", number1, number2, number1 * number2);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", number1, number2, number1 / number2);
                break;
            
            default:
                System.out.printf("You typed an invalid option");        
            
        }
        

    }
}
