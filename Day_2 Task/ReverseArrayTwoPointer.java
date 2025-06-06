package dsa;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayTwoPointer {

    public static void main(String[] args){
        Scanner rk = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = rk.nextInt();
        Integer[] b = new Integer[size];
System.out.println("Enter the array elements:");
        for(int i = 0; i < size; i++) {
            b[i] = rk.nextInt();
        }
Arrays.sort(b, Collections.reverseOrder());

        System.out.println("Array in descending order:");
        for(int num : b) {
            System.out.println(num);
        }

        rk.close();
        }
}
