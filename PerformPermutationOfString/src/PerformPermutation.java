/**
 * Write static functions to return all permutations of a String using iterative method and Recursion method.
 * Check if the arrays returned by two string functions are equal.
 *
 * @author: SAYANI KOLEY
 * @since: 24.06.2021
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PerformPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PerformPermutationRecursion pRecursion = new PerformPermutationRecursion();
        PermutationUsingIteration pIteration = new PermutationUsingIteration();

        System.out.print("Enter the string: ");
        String str = input.next();
        int lengthOfString = str.length();

        ArrayList<String> array = new ArrayList<>();
        array = pRecursion.permute(str, 0, lengthOfString-1);
        System.out.print("Permutation using Recursion: ");
        for(int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + " ");

        System.out.println();

        ArrayList<String> array1 = new ArrayList<>();
        array1 = pIteration.permute(str);
        System.out.print("Permutation using Iteration: ");
        for(int i = 0; i < array1.size(); i++)
            System.out.print(array1.get(i) + " ");

        System.out.println();

        Collections.sort(array);
        Collections.sort(array1);

        if(array.equals(array1))
            System.out.println("Values in both the arraylist is equal.");
        else
            System.out.println("Values in both the arraylist is not equal.");
    }
}
