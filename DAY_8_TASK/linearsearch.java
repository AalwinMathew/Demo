package project;

import java.util.Arrays;
import java.util.Scanner;

public class linear_search {
	public static void main(String[] args) {
		int arr[]= {5,1,8,3,90,12,2};
		System.out.println(Arrays.toString(arr));
		Scanner rk=new Scanner(System.in);
		System.out.println("enter the value");
		int find=rk.nextInt();
		boolean flags=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find)
			{
				System.out.println("value found"+" "+arr[i]+" "+"at index"+" "+i);
				flags=true;
				break;
			}
			
		}
		
		System.out.println("value not found");
		flags=false;
		
		
		
	}
	
	

	}