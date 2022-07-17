package com.algorithms.sort;

import java.util.Arrays;

/**
 * Compare adjacent numbers till the largest element is moved to the end of the array
 * Repeat the steps till the array is sorted
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {74, 73, 38, 34, 9, 7, 6, 5, 3, 2};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] numbers, int src, int dest) {
        int temp = numbers[src];
        numbers[src] = numbers[dest];
        numbers[dest] = temp;
    }

}
