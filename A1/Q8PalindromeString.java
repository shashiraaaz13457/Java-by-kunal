package A1;

import java.util.Scanner;
// didn't done by me(seen)
//Program for checking whether a given String is Palindrome or not.
public class Q8PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Your String: ");
        String String = input.next();
        boolean flag = true;

        for(int i = 0; i < String.length()/2; i++){
            if (String.charAt(i) != String.charAt(String.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }

    }
}
