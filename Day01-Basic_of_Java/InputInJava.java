package Basicofjava;
import java.util.Scanner; // Remember this too
public class InputInJava {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = sc.nextInt();
        System.out.println("The square of a number is: " + x*x);
    }
}
