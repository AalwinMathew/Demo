package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }Arrays.sort(arr);        
        int uniqueLength = removeDuplicates(arr);   
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }  
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }
}
