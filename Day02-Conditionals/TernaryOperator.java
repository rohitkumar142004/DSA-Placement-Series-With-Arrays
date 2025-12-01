package conditionals;
import java.util.Scanner;
public class TernaryOperator {
    // Ternary operator -- condition ? sach : jhoot
    // if else ko likhne ka short cut hai means we can write if else in one code of the line

    // condition ? if true: if false
    static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       //  b = 100 if a is positive
        // b should be 99 if a is negative
        int b = (n>=0) ? 100: 90;
        System.out.println(b);
    }
}
