package Arrays;

public class BinarySearchELementNotFound {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int k = 25;
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while(low<=high){
            int mid = (high + low)/2;

            if(arr[mid] == k){
                index = mid;
                break;
            }else if(k > arr[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("Element Not found");
        }
    }
}
