package PatternPrinting;
import java.util.Scanner;
public class AlphaNumericTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if(i%2==1){
                    System.out.print((char)(j+64)+ " ");
                }else{
                    System.out.print(i+ " ");
                }
            }
            System.out.println();
        }
    }
}
