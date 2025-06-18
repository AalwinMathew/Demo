package project;

import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
	public static int binary(int []arr,int left,int right,int target) {
		if(left>right) {
			return -1;
		}
		int mid=(left+right)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		else if(arr[mid]<target)
		{
			return binary(arr,mid+1,right,target);
		
		}
		else
		{
			return binary(arr,left,mid-1,target);
		}
	
		
	}
	public static void main(String []args) {
		int[] arr=new int[10];
		Scanner rk= new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter values ");
            arr[i] = rk.nextInt();
        }
		
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
		System.out.print("Enter target to search: ");
        int target = rk.nextInt();

        int result = binary(arr, 0, arr.length - 1, target);

      
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }

    }

}
