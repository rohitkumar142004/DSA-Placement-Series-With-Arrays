package PatternPrinting;
import java.util.Scanner;
public class AlphabetSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((char)(j+64)+ " "); // inplace of j if we write i then it will print aaaa then in next line bbbb
            }
            System.out.println();
        }
    }
}
