/**
 * Binary Search the Word from Word List
 * Read in a list of words from File. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list.
 * I/P -> Read in the list words comma separated from a File and then enter the word to be searched
 * Logic -> Use Arrays to sort the word list and then do the binary search
 * O/P -> Print the result if the word is found or not
 *
 * @author: SAYANI KOLEY
 * @since: 24.06.2021
 */

package com.sayani.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read data from the file
        ReadFile read = new ReadFile();
        ArrayList<String> dataArray = read.readFile();

        //sort the data in ascending order
        Collections.sort(dataArray);

        //Take input from the user to search for the word
        System.out.print("Enter the word you want to search from the file: ");
        String value = input.next();

        //convert the arraylist into array to pass it to the generic class
        String[] array = new String[dataArray.size()];
        array = dataArray.toArray(array);

        //Create object for binary search class and check if the user input element is present or not
        BinarySearchImplementation<String> searcher = new BinarySearchImplementation<>(array);
        int result = searcher.search(value);
        if (result >= 0) {
            System.out.println(value + " is at index " + result + " in the array");
        } else {
            System.out.println(value + " is not in the array.");
        }
    }
}
