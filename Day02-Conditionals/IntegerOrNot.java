package conditionals;
import java.util.Scanner;
public class IntegerOrNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = sc.nextDouble();
        int x = (int)num; // typecast
        if (num==x){
            System.out.println("Number is Integer");
        }else{
            System.out.println("Not a Integer");
        }
    }
}
