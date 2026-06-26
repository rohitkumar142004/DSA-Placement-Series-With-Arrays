package Arrays;

public class SecondLargestElement {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int smax = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("Second largest element of the array: "+ smax);
    }
}
