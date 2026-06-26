package Arrays;

public class RemovingDuplicates {
    public static void main(String[] args) {

        /*int[] arr = {10,10,20,20,30,40,40};

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        // Print the last element
        System.out.print(arr[arr.length - 1]);
        */

        int[] arr = {10,20,10,30,20,40};

        for(int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}