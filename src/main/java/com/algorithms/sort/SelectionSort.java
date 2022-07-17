package com.algorithms.sort;

import java.util.Arrays;

/**
 * Selects the biggest/smallest number from the array and moves it to the right
 * Iterate the steps till the array is sorted
 * Similar to Bubble sort, but reduces the number of swaps
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {74, 73, 38, 34, 9, 7, 6, 5, 3, 2};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            swap(numbers, i, minIndex);
        }
    }

    private static void swap(int[] numbers, int src, int dest) {
        if (src == dest) {
            return;
        }
        int temp = numbers[src];
        numbers[src] = numbers[dest];
        numbers[dest] = temp;
    }
}
