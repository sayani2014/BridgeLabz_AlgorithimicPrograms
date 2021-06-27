/**
 * Merge Sort - Write a program to do Merge Sort of list of Strings.
 * Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves independently, and then merge the results to sort the full array. To sort a[lo, hi),
 * I/P -> Read data from the input file
 *
 * @author: SAYANI KOLEY
 * @since: 24.06.2021
 */

package com.sayani.mergesort;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read data from the file
        ReadFile read = new ReadFile();
        ArrayList<String> dataArray = read.readFile();

        //convert the arraylist into array to pass it to the generic class
        String[] array = new String[dataArray.size()];
        array = dataArray.toArray(array);

        System.out.print("Before sorting: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int startIndex = 0;
        int length = array.length;
        int lastIndex = length - 1;

        //call the bubble sort method
        MergeSortImplementation mergeSort = new MergeSortImplementation(array);
        mergeSort.sort(array, startIndex, lastIndex);
        mergeSort.printSortedArray();
    }
}
