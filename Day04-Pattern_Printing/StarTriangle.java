package PatternPrinting;
import java.util.Scanner;
public class StarTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int n1 = sc.nextInt();
        System.out.println("Enter cols: ");
        int n2 = sc.nextInt();
        for(int i = 1; i<=n1; i++){ // lines or rows
            for(int j = 1; j<=n2; j++){ // stars in each line or cols
                System.out.print("* ");
            }
            System.out.println(); // enter
        }
    }
}
