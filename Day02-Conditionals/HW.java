package conditionals;
import java.util.Scanner;
public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 999 && num < 10000) {
            System.out.println("It is Four Digit Number");
        } else {
            System.out.println("It is not Four Digit Number");
        }
    }

}
