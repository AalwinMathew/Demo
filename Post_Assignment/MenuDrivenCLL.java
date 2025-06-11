package dsa;

import java.util.Scanner;

public class MenuDrivenCLL {

    Node last;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public MenuDrivenCLL() {
        last = null;
    }
    public void insert(int val) {
        Node newnode = new Node(val);
        if (last == null) {
            last = newnode;
            last.next = last;
        } else {
            newnode.next = last.next;
            last.next = newnode;
            last = newnode;
        }
    }
    public void deleteHead() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        if (last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
        }
    }
    public void deleteAtPosition(int pos) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        if (pos == 1) {
            deleteHead();
            return;
        }

        Node current = last.next;
        Node prev = null;
        int count = 1;

        do {
            prev = current;
            current = current.next;
            count++;

            if (count == pos) {
                prev.next = current.next;
                if (current == last) {
                    last = prev;
                }
                return;
            }
        } while (current != last.next);

        System.out.println("Invalid position.");
    }
    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuDrivenCLL list = new MenuDrivenCLL();
        int choice;

        do {
            System.out.println("\n--- Circular Linked List Menu ---");
            System.out.println("1. Insert at Tail");
            System.out.println("2. Delete from Head");
            System.out.println("3. Delete at Position");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.insert(val);
                    break;
                case 2:
                    list.deleteHead();
                    break;
                case 3:
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                    list.deleteAtPosition(pos);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
