package com.algorithms.sort;

import java.util.Arrays;

/**
 * <ol>
 *     <li> The first element is sorted by default</li>
 *     <li> Take the next element and place it in it's appropriate index</li>
 *     <li> Repeat till the array is iterated</li>
 * </ol>
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {74, 73, 38, 34, 9, 7, 6, 5, 3, 2};
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int j = i - 1;
            int val = numbers[i];
            while (j >= 0 && numbers[j] > val) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = val;
        }
    }
}
