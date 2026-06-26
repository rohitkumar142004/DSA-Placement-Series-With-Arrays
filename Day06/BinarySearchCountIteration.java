package Arrays;

public class BinarySearchCountIteration {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70};
        int key = 70;

        int low = 0;
        int high = arr.length - 1;

        int index = -1;
        int count = 0;

        while(low <= high){

            count++;

            int mid = (low + high) / 2;

            if(arr[mid] == key){
                index = mid;
                break;
            }
            else if(key > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        System.out.println("Index: " + index);
        System.out.println("Iterations: " + count);
    }
}