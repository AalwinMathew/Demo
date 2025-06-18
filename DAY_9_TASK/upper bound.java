package project;

import java.util.Scanner;
public class upper_bound {

		public static void main(String[] args) {
			int []arr= {2,3,3,4,15,23,26,30,66};
			Scanner rk=new Scanner(System.in);
			System.out.println("enter the value:");
			int target=rk.nextInt();
			
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
			
			if(left==arr.length){
				System.out.println("No greater number then the value:"+" "+target+" "+"upper bound does not exist");
			}
			else
			{
				System.out.println("upper bound found at index:"+" "+left+" "+"\nthe value is:"+" "+arr[left]);
			}
		

	}
}

