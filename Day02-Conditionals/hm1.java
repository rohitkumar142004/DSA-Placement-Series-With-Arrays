// HW: Take integer input and tell if its mangnitude is smaller than 69 or not.


package conditionals;
import java.util.Scanner;
public class hm1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (Math.abs(num) < 69 && Math.abs(num) > -69){
            System.out.println("It is smaller than 69");

        }else{
            System.out.println("It is not smaller than 69");
        }
    }
}
