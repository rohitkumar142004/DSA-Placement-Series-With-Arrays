package array2nd;

public class SortInWave {
    static void main() {
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i<arr.length - 1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
