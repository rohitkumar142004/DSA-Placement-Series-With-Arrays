package Arrays;

public class LargestElementInArray {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
