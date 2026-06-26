package Arrays;

public class CountEvenAndOddNumbersInArray {
    static void main(String[] args) {
        int[] arr = {10,20,40,50,60,70};
        int even = 0;
        int odd = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even:" + even);
        System.out.println("Odd: " + odd);
    }
}
