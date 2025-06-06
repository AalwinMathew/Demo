package test;

import java.util.Scanner;

public class SumOfDigits {

   
    public static int sumDigits(int num) {
        if (num == 0)
            return 0;
        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of its digits: ");
        int number = scanner.nextInt();

        int result = sumDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + result);

        scanner.close();
    }
}
