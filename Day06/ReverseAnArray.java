package Arrays;

public class ReverseAnArray {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int rev = 0;
        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
