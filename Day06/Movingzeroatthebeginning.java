package array2nd;

public class Movingzeroatthebeginning {
    static void main(String[] args) {
        int[] nums = {10, 20, 0, 0, 30, 50, 0};

        int index = nums.length - 1;

        // Move non-zero elements to the end
        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index--;
            }
        }

        // Fill beginning with zeros
        while (index >= 0) {
            nums[index] = 0;
            index--;
        }
    }

}