import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//       int num = input.nextInt();
//        System.out.println(num);

        //TypeCasting (Explicitly)
        int num = (int) (67.5f);
        System.out.println(num);

//        Automatic type promotion in expressions
//        Maximum range of byte is 256.

//        int a = 300;
//        byte b = (byte) (a); // 300 % 256 = 44
//
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//        If range exceeds the byte range java automatically converted the
//        calculation in int if we mention.(just like i have mention int to store the calculation.)

//        System.out.println(d);

        int number = 'A';
        System.out.println(number);

        // java follows the unicode values , you can print anything hindi,chinese anything

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
//        float + int - double = double(because it has large range)
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
