package project;

import java.util.Scanner;

public class find_the_rank {
	    public static int Bound(int[] arr, int target) {
	        int left = 0, right = arr.length;
	        while (left < right) {
	            int mid = (right + left) / 2;
	            if (arr[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left; 
	    }

	    public static void main(String[] args) {
	        int[] arr = new int[8];
	        Scanner rk=new Scanner(System.in);
	        System.out.println("enter the value:");
	        for(int i=0;i<arr.length;i++)
	        {
	        	arr[i]=rk.nextInt();
	        }
	        System.out.println("enter the target:");
	        int target=rk.nextInt();
	        int rank = Bound(arr, target);
	        System.out.println("Rank of " + target + " is: " + rank);
	    }
	}



