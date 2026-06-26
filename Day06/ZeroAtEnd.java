package Arrays;

public class ZeroAtEnd {
    static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4};

        int index = 0;

        // Move non-zero elemnts to the front
        for(int i = 0; i <arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        // fill remaining positions with o
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }
        // print the array
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
