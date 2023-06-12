package A1;

import java.util.Scanner;

//Program for Fibonacci Series.
public class Q7FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Fibonacci Sequence You want to print: ");
        int count = input.nextInt();

//        int num1,num2;
        int num1 =0 ,num2 = 1;
        System.out.print(num1);
        System.out.print(num2);

        for(int i=1; i<=count-2; i++){
            int result = num1 + num2;
            System.out.print(result);
            num1 = num2;
            num2 = result;
        }

    }
}
