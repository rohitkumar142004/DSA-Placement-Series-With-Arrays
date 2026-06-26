package Arrays;

public class RotationInArray {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int k = 2;

        for(int j = 1; j <= k; j++){
            int temp = arr[0];

            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length - 1] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
