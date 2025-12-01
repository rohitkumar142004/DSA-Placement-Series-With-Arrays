// homework question
// Given a point (X,y), write a program to find out if it lies in the 1st quadrant, 2nd quadrant, 3rd quadrant, 4th quadrant
// on the x-axis, y-axis or at the origin


package conditionals;
import java.util.Scanner;
public class HW3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int y = sc.nextInt();
        if (x>0 && y > 0){
            System.out.println("The point will lies in 1st Quadrant");
        }else if (x<0 && y > 0){
            System.out.println("The point will lies in the 2nd Quadrant");
        }else if (x<0 && y < 0){
            System.out.println("The point will lies in the 3rd Quadrant");
        }else if (y < 0 && x > 0){
            System.out.println("The point will lies in the 4th Quadrant");
        }else if(x == 0 && y == 0 ){
            System.out.println("The point will lies on the Origin");
        }else if(x>0 && y==0){
            System.out.println("The point will lies on the x axis");
        }else{
            System.out.println("The point will lies on the y axis");
        }
    }

}



// Do one thing after this else if try to solve this question with the nested loop, and see if it is consuming less space and the memeory compare to else