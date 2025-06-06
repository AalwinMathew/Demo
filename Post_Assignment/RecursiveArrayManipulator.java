package test;
import java.util.Scanner;

public class RecursiveArrayManipulator {
    static int[] arr = new int[100]; 
    static int n = 0; 
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of elements to start: ");
        n = scanner.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        menu();
    }

    public static void menu() {
        System.out.println("\n--- Recursive Array Menu ---");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Display");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                insert();
                break;
            case 2:
                delete();
                break;
            case 3:
                update();
                break;
            case 4:
                display();
                break;
            case 5:
                System.out.println("Exiting...");
                return; 
            default:
                System.out.println("Invalid choice.");
        }

       
        menu();
    }

    public static void insert() {
        if (n >= arr.length) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }

        System.out.print("Enter position to insert (0 to " + n + "): ");
        int pos = scanner.nextInt();
        if (pos < 0 || pos > n) {
            System.out.println("Invalid position.");
            return;
        }

        System.out.print("Enter value to insert: ");
        int val = scanner.nextInt();

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = val;
        n++;
        System.out.println("Element inserted.");
    }

    public static void delete() {
        System.out.print("Enter position to delete (0 to " + (n - 1) + "): ");
        int pos = scanner.nextInt();
        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;
        System.out.println("Element deleted.");
    }

    public static void update() {
        System.out.print("Enter position to update (0 to " + (n - 1) + "): ");
        int pos = scanner.nextInt();
        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position.");
            return;
        }

        System.out.print("Enter new value: ");
        int val = scanner.nextInt();
        arr[pos] = val;
        System.out.println("Element updated.");
    }

    public static void display() {
        System.out.print("Current array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
