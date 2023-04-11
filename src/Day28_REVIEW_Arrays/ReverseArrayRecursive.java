/*
 * Copyright (c) 2023.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day28_REVIEW_Arrays;

public class ReverseArrayRecursive {
    public static void reverseArray(char[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap the values at the start and end indices
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively call the function with the next set of indices
        reverseArray(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        char[] myArray = {'m', 'e', 'r', 'h', 'a','b','a'};

        System.out.println("Orijinal char array before method called.");
        for(char harf :myArray){
            System.out.print(harf + " ");
        }
        System.out.println();

        reverseArray(myArray, 0, myArray.length-1);
        System.out.println("Reversed char array after method called.");
        for(char harf :myArray){
            System.out.print(harf + " ");
        }
    }
}
