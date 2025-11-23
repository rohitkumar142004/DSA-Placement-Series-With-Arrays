package conditionals;
import java.util.Scanner;
public class AbsoluteValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        num = Math.abs(num);
        System.out.println(num);
    }
}
