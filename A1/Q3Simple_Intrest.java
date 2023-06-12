package A1;

import java.util.Scanner;

public class Q3Simple_Intrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int Principal = input.nextInt();
        System.out.print("Enter Time in years: ");
        int Time = input.nextInt();
        System.out.print("Enter Rate (no % sign): ");
        float Rate = input.nextInt();

        float result = (Principal * Time * (Rate/100))/100;

        System.out.println("Simple Interest is: " + result);


    }
}
