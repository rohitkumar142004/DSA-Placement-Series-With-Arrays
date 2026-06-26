package Arrays;

public class FrequencyOfAnElement {
    static void main(String[] args) {
        int[] arr = {10,20,10,30,20,10};
        int k = 10;
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }
        System.out.println("Frequency is : "+count);
    }
}
