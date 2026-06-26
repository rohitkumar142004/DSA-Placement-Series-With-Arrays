package Arrays;

public class LeftrotationOfArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Step 1: Store first element
        int temp = arr[0];

        // Step 2: Shift elements to the left
        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Step 3: Put first element at the end
        arr[arr.length - 1] = temp;

        // Print the array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}