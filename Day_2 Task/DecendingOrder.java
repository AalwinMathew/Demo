package dsa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class DecendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        Integer[] originalArray = new Integer[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        
        }
        Integer[] sortedArray = originalArray.clone();
        Arrays.sort(sortedArray, Collections.reverseOrder());
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sorted Array (Descending): " + Arrays.toString(sortedArray));
    }
}
