// Take 3 positive integers input and print the greatest of them.
package conditionals;
import java.util.Scanner;
public class GreatestOfThem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();
        if (a>=b && a >= c){
            System.out.println(" A is the Greatest Number");
        }else{
            if (b>=c && b >=a){
                System.out.println(" B is the Greatest Number");
            }else{
                System.out.println(" C is the Greatest Number");
            }
        }
    }
}
