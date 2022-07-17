package com.algorithms.sort;

import java.util.Arrays;

/**
 * Divide and Conquer algorithm.
 * <ol>
 *  <li>Divide the array into sub arrays by selecting a pivot - elements in the left of pivot should be lesser and the right should be greater than the pivot </li>
 * <li>The sub arrays are recursively divided till only one element is in the array </li>
 * </ol>
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = {74, 73, 38, 34, 9, 7, 6, 5, 3, 2};
        quickSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
    }

    private static void sort(int[] numbers, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(numbers, start, end);
            sort(numbers, start, partitionIndex - 1);
            sort(numbers, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int j = start;
        for (int i = start; i < end; i++) {
            if (pivot > numbers[i]) {
                swap(numbers, i, j);
                j++;
            }
        }
        swap(numbers, j, end);
        return j;
    }

    private static void swap(int[] numbers, int src, int dest) {
        int temp = numbers[src];
        numbers[src] = numbers[dest];
        numbers[dest] = temp;
    }
}
