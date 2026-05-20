package PatternPrinting;
import java.util.Scanner;
public class NumberSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(j + " ");
                // why we are using j because for i it will prin at just for i iteration while in j it will print till 5
            }
            System.out.println();
        }
    }
}
