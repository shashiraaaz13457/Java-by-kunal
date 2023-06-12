package A1;

import java.util.Scanner;

//Program for performing various operations.
public class Q4Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :" );
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        System.out.print("Enter the Operator : ");
        char Operator = input.next().charAt(0);

        int result = 0;
        if(Operator == '+'){
            result = num1 + num2;
        }
        else if(Operator == '-'){
            result = num1 - num2;
        }
        else if(Operator == '*'){
            result = num1 * num2;
        }
        else if(Operator == '/'){
            result = num1 / num2;
        }
        System.out.print("Your answer is: " + result);
    }
}
