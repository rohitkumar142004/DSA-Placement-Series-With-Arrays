package Arrays;

public class LinearSearchInArray {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 60;
        int index = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==k){
                index = i;
                break;
            }
        }
        System.out.println("Element is present at the index: "+ index);
    }
}
