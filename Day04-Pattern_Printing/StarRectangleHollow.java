package PatternPrinting;
import java.util.Scanner;
public class StarRectangleHollow {
    static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int m = sc.nextInt();
        System.out.println("Enter cols");
        int n = sc.nextInt();

        for(int i = 1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }


}
