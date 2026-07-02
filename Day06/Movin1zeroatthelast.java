package array2nd;

class Movin1zeroatthelast {
    public void moveZeroes(int[] nums) {

        int index = 0;

        // Move non-zero elements to the front
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }
    }
}