package A1;

import java.util.Scanner;

public class Q2Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.print(name + " welcome to [brand name]! Thank you for being a part of our community. We will get back to you as soon as we are able to");
    }
}
