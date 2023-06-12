package A1;
// Even and odd program.

import java.util.Scanner;

public class Q1EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.print(num + " is even");
        } else {
            System.out.print(num + " is odd");
        }
    }
}
