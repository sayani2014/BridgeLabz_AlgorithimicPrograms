/**
 * Insertion Sort
 *  Desc -> Reads in strings and prints them in sorted order using insertion sort.
 *  I/P -> read in the list words
 *  Logic -> Use Insertion Sort to sort the words in the String array
 *  O/P -> Print the Sorted List
 *
 * @author: SAYANI KOLEY
 * @since: 24.06.2021
 */

package com.sayani.insertionsort;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSortMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read data from the file
        ReadFile read = new ReadFile();
        ArrayList<String> dataArray = read.readFile();

        //convert the arraylist into array to pass it to the generic class
        String[] array = new String[dataArray.size()];
        array = dataArray.toArray(array);

        //call the insertion sort method
        InsertionSortImplementation insertionSort = new InsertionSortImplementation(array);
        insertionSort.sort();
    }
}
