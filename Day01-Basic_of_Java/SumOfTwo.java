package Basicofjava;
import java.util.Scanner;
public class SumOfTwo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println(a + "+" + b + " = " + (a+b));


        System.out.println("Hello"+a+b); // in computer in case of bodmas of same sign it will add first 2 then so it will print hello1020
        System.out.println(a+b+"Hello"); // this will print 30 Hello




    }
}
