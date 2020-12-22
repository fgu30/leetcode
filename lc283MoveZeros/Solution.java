package lc283MoveZeros;

import java.util.Arrays;

public class Solution {
    void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }

        }

    }
}

class test {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1 };
        Solution solute = new Solution();
        solute.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}