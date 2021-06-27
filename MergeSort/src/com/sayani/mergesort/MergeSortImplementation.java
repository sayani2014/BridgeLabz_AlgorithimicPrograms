package com.sayani.mergesort;

public class MergeSortImplementation<T extends Comparable<T>> {
    T[] elements;

    public MergeSortImplementation(T[] elements) {
        this.elements = elements;
    }

    public void sort(T[] elements, int startIndex, int lastIndex) {
        // base case
        if (startIndex < lastIndex) {
            // find the middle point
            int middle = (startIndex + lastIndex) / 2;
            // sort first half
            sort(elements, startIndex, middle);
            // sort second half
            sort(elements, middle + 1, lastIndex);
            // merge the sorted halves
            merge(elements, startIndex, middle, lastIndex);
        }
    }

    // merges two subarrays of array[].
    void merge(T[] array, int start, int middle, int end)
    {
        T[] leftArray  = (T[]) new Comparable[middle - start + 1];
        T[] rightArray = (T[]) new Comparable[end - middle];

        // fill in left array
        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = array[start + i];

        // fill in right array
        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = array[middle + 1 + i];

       // initial indexes of first and second subarrays
        int leftIndex = 0, rightIndex = 0;

        // the index we will start at when adding the subarrays back into the main array
        int currentIndex = start;

        // compare each index of the subarrays adding the lowest value to the currentIndex
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0) {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        // copy remaining elements of leftArray[] if any
        while (leftIndex < leftArray.length)
            array[currentIndex++] = leftArray[leftIndex++];

        // copy remaining elements of rightArray[] if any
        while (rightIndex < rightArray.length)
            array[currentIndex++] = rightArray[rightIndex++];
    }

    public void printSortedArray() {
        System.out.print("After sorting: ");
        for(int i = 0; i < elements.length; i++)
            System.out.print(elements[i] + " ");
    }
}
