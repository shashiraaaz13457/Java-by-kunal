package A1;

import java.util.Scanner;

public class ArmstrongNo {
//    Try one more time.can
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
//        int n = 0;
        int rem = 0;
        int sum = 0;
        int temp = num;

        while (num > 0){
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num/10;

        }
        if (temp == sum){
            System.out.println("Armstrong number");
        } else {
            System.out.println(" Not a Armstrong number");
        }
    }

}
