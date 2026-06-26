package Arrays;

public class SmallestElement {
    static void main(String[] args) {
        int[] arr = {10,25,8,40,15};
        int small = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<small) {
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
