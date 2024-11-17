package com.gmail.jarikzagreb16;
import java.util.Arrays;

import static Sort_search.Binarysearch.binarySearch;
import static Sort_search.BubbleSort.bubbleSort;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int t = 12;
        bubbleSort(arr);
        System.out.println("Відсортований масив:" + Arrays.toString(arr));
        int result = binarySearch(arr, t);
        if (result != -1) {
            System.out.println("Елемент " + t + " знайдено на індексі: " + result);
        } else {
            System.out.println("Елемент " + t + " не знайдено в масиві.");
        }
    }
}

