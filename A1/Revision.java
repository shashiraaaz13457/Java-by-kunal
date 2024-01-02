package A1;
import java.util.Scanner;
public class Revision {
    // Ques1: Largest number (input 3 no.) method 1(self)

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//        if (a > b){
//            if (a > c){
//                System.out.println("greater number is: " + a);
//            }
//            else {
//                System.out.println("greater number is: " + c);
//            }
//        } else {
//            if (b > c){
//                System.out.println("greater number is: " + b);
//            }
//            else {
//                System.out.println("greater number is: " + c);
//            }
//        }
//    }

    // Method 2
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println("Greatest number is "+max);

        //Method 3
//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(max);
//    }


    // Ques2: Check whether the letter you have input is in uppercase or lowercase(CaseCheck)
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        //trim basically means removing the space
//        char ch = input.next().trim().charAt(0);
//
//        if(ch >= 'a' && ch <= 'z'){
//            System.out.println("lowercase");
//        }
//        else {
//            System.out.println("Uppercase");
//        }
////        System.out.println(ch);
//    }

    //Ques3: Fibonacci Series
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 1;
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int count = 2;
//        while (count < n){
//            int temp = num2;
//            num2 = num1+num2;
//            System.out.println(num2);
//            num1 = temp;
//            count++;
//        }
////        System.out.println(num2);
//    }

    //Ques4: Counting how much that number comes in the question

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int count=0;
//        while (n>0){
//            int rem = n%10;
//            if (rem == 3){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);
//    }

    //Ques5: Reverse the number
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int ans = 0;
//        while (num > 0){
//            int rem = num%10;
//            num = num/10;
//            ans = (ans*10) + rem;
//        }
//        System.out.println(ans);
//    }

    //Calculator program
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        //Take input from user till user doesn't press X or x
//        int ans =0;
//        while (true){
//            System.out.println("Enter the operator: ");
//            char op = input.next().trim().charAt(0);
//            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//                //input two numbers
//                System.out.println("Enter two numbers: ");
//                int num1 = input.nextInt();
//                int num2 = input.nextInt();
//
//                if (op == '+') {
//                    ans = num1 + num2;
//                }
//                if (op == '-') {
//                    ans = num1 - num2;
//                }
//                if (op == '*') {
//                    ans = num1 * num2;
//                }
//                if (op == '/') {
//                    if (num2 != 0){
//                        ans = num1 / num2;
//                    }
//                }
//                if (op == '%') {
//                    ans = num1 % num2;
//                }
//            }
//            else if (op == 'x' || op == 'X'){
//                break;
//            }
//            else {
//                System.out.println("INVALID OPERATION");
//            }
//            System.out.println(ans);
//        }
//
//    }
}


