// Take 3 positive integers input and tell if they can be the sides of a triangle or not



package conditionals;
import java.util.Scanner;
public class MultipleCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a+b<c && b+c<a && c+a<b){
            System.out.println(" They can be the side of the triangle");
        }else{
            System.out.println("They can't be the side of the triangle");
        }
    }
}
// && -- LOGICAL AND ""|| LOGICAL OR

