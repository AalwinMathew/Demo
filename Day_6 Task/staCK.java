package test;

import java.util.Scanner;

public class staCK {

    int[] num = new int[5];
    int top = -1;

    public void push(int n) {
        if (top < num.length - 1) {
            num[++top] = n;
            System.out.println("Pushed: " + n);
        } else {
            System.out.println("Stack overflow");
        }
    }

    public void pop() {
        if (top != -1) {
            System.out.println("Popped: " + num[top--]);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        if (top != -1) {
            System.out.println("Top value: " + num[top]);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack contents (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staCK stack = new staCK();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. EXIT");
            System.out.print("Enter your option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        
    }
}
