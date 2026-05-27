package Method;
import java.util.Scanner;
public class MethodArguments {

    static void main(String[] args) {
        max(4,2,7); // arguments
    }
    static void max(int a, int b, int c){  // parameters
        if(a>b && a>c){
            System.out.println(a+" is the largest one");
        }else if(b>c && b>a){
            System.out.println(b+" is the largest one");
        }else if(c>a && c>b){
            System.out.println(c+" is the largest one");
        }else{
            System.out.println("All are equal");
        }
    }
}
