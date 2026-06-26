package Arrays;

public class ArrayIsSorted {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        boolean sorted = true;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if(sorted) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is Not Sorted");
        }
    }
}