package leetcode;

import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {
    public static int[] bubblSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]test = new int[]{3,5,3,2,1};
        int[]ans = bubblSort(test);
        System.out.println(Arrays.toString(ans));
    }
}