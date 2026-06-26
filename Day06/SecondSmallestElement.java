package Arrays;

public class SecondSmallestElement {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int small = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }

        int rsmall = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<rsmall && arr[i]!=small){
                rsmall = arr[i];
            }
        }
        System.out.println(rsmall);
    }
}
