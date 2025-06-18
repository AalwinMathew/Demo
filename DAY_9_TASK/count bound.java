package project;

import java.util.Scanner;

public class count_bound {
		public static int lower(int[] arr,int target) {
			int left=0,right=arr.length;
			int mid;
			
			while(left<right) {
				mid=(left+right)/2;
				
				if(arr[mid]<target) {
					left=mid+1;
				}
			else if(arr[mid]>=target) {
				right=mid;
			}
		}
			return left;
		}
		public static int upper(int []arr,int target) {
			int left=0;
			int right=arr.length;
			int mid;
			
			while(left<right) {
				mid=(left+right)/2;
				
				if(arr[mid]<=target) {
					left=mid+1;
				}
				else {
				right=mid;
			}	
				
			}
			return left;
		}
		public static void main(String[] args) {
			int []arr=new int[8];
			Scanner rk=new Scanner(System.in);
			System.out.println("enter the value:");
			for(int i=0;i<arr.length;i++) {
				arr[i]=rk.nextInt();
			}
			 System.out.println("enter the target:");
			 int target=rk.nextInt();
			 
			 int low=lower(arr,target);
			 int up=upper(arr,target);
			 int result=(up-low);
			 if(result!=1) {
				 System.out.println("the target was found:"+" "+result);
			 }
			 else
			 {
				 System.out.println("wrong input");
			 }
		}

}

