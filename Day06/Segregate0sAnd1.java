package array2nd;

public class Segregate0sAnd1 {
    static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1};

        int CountOfZeros = 0;

        // Move non-zero elemnts to the front
        for(int i = 0; i <arr.length; i++){
            if(arr[i]==0){
                CountOfZeros++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i<CountOfZeros){
                arr[i]=0;
            }else{
                arr[i] = 1;
            }
        }

        // print the array

    }
}
