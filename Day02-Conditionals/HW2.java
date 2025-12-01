// Take 3 Positive integers input and print the least of them.

package conditionals;
import java.util.Scanner;
public class HW2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if ( x < y && x < z){
            System.out.println("x is the least of them");
        }else if (y < x && y < z){
            System.out.println(" y is the least of them");
        }else{
            System.out.println("z is the least of them");
        }
    }
}
