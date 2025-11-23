package conditionals;
import java.util.Scanner;
public class DriveOrNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        if (age < 18){
            System.out.println("You can't drive because your age is : " + age);
        }else{
            System.out.println("You can drive because your age is : " + age);
        }


    }
}
