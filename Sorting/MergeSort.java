package Sorting;

import java.util.Arrays;

/**
 * MergeSort
 */
public class MergeSort {

    void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        _mergeSort(arr, temp, 0, arr.length - 1);
    }

    void _mergeSort(int[] arr, int[] temp, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        _mergeSort(arr, temp, start, mid);
        _mergeSort(arr, temp, mid + 1, end);
        merge(arr, temp, start, end, mid);

    }

    void merge(int[] arr, int[] temp, int start, int end, int mid) {
        int left = start;
        int right = mid + 1;
        int m = start;
        while (left <= mid && right <= end) {
            if (arr[left] > arr[right]) {
                temp[m++] = arr[right++];

            } else {
                temp[m++] = arr[left++];

            }
        }
        while (left <= mid) {
            temp[m++] = arr[left++];
        }

        while (right <= end) {
            temp[m++] = arr[right++];
        }

        for (int i = start; i <= end; i++) {
            arr[i] = temp[i];
        }
    }

}

class test {
    public static void main(String[] args) {
        MergeSort test = new MergeSort();
        int[] testcase = { 4, 1, 8, 11, 13, 20 };
        test.mergeSort(testcase);
        System.out.println(Arrays.toString(testcase));
    }
}