package String;
import java.util.Scanner;
public class BinaryToDecimal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int decimal = 0;
        int pow = 0;
        for(int i = binary.length() - 1; i >= 0; i-- ){
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, pow);

            }
            pow ++;
        }
        System.out.println(decimal);
    }
}
