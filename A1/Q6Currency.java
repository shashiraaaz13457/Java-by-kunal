package A1;

import java.util.Scanner;

//Program for Printing rupees in USD.
public class Q6Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your amount in Rupees : Rs");
        float CurrencyInRupees = input.nextFloat();

        float CurrencyInUsd = (CurrencyInRupees/(float)(82.57));
        System.out.print("Currency in USD is : $" + CurrencyInUsd);
    }
}
