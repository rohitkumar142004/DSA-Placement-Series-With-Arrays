



//if cose price and sellin price of an item is input through the keyboard, write a program
//to determine whether the seller has made profit or incurred loss or no profit no loss. Also
//determine how much profit he made or loss he incurred


package conditionals;
import java.util.Scanner;
public class VviQuestion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price ");
        int costprice = sc.nextInt();
        System.out.println("Enter the Selling Price ");
        int sellingprice = sc.nextInt();

        if (costprice > sellingprice){
            System.out.println("The seller has made a loss of : " + (costprice-sellingprice));
        }else if (costprice == sellingprice){
            System.out.println("No profit no loss");
        }else{
            System.out.println("The seller made profit of : " + (sellingprice-costprice));
        }
    }

}
