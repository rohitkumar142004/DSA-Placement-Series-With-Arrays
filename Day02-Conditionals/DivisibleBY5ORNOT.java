package conditionals;
import java.util.Scanner;
public class DivisibleBY5ORNOT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%3==0 && num%5==0){
            System.out.println("It is Divisible by both 5 and 3");
        }else{
            System.out.println("It is not Divisible by both 5 and 3");
        }
    }

}
