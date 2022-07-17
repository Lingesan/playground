package com.algorithms.sort;

import java.util.Arrays;

/**
 * Divide and Conquer algorithm.
 * <ol>
 *     <li>Divide the array into sub arrays</li>
 *     <li>The sub arrays are recursively divided till only one element is in the array </li>
 *     <li>Sort the sub arrays</li>
 *     <li>Merge the sub arrays recursively</li>
 * </ol>
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] numbers = {74, 73, 38, 34, 9, 7, 6, 5, 3, 2};
        mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void mergeSort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
    }

    private static void sort(int[] numbers, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(numbers, start, mid);
            sort(numbers, mid + 1, end);
            merge(numbers, start, mid, end);
        }
    }

    private static void merge(int[] numbers, int start, int mid, int end) {
        int len1 = mid - start + 1;
        int len2 = end - mid;

        int[] leftArray = new int[len1];
        int[] rightArray = new int[len2];

        System.arraycopy(numbers, start, leftArray, 0, len1);
        System.arraycopy(numbers, mid + 1, rightArray, 0, len2);

        int i = 0, j = 0, k = start;
        while (i < len1 && j < len2) {
            if (leftArray[i] < rightArray[j]) {
                numbers[k++] = leftArray[i++];
            } else {
                numbers[k++] = rightArray[j++];
            }
        }
        while (i < len1) {
            numbers[k++] = leftArray[i++];
        }
        while (j < len2) {
            numbers[k++] = rightArray[j++];
        }
    }

}
