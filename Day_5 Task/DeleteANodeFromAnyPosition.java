package dsa;

import java.util.Scanner;

public class DeleteANodeFromAnyPosition {

    Node last;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public DeleteANodeFromAnyPosition() {
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

    public void deleteAtPosition(int position) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

     
        if (last.next == last && position == 1) {
            last = null;
            return;
        }

        if (position == 1) {
            last.next = last.next.next;
            return;
        }

        Node current = last.next;
        Node prev = null;
        int count = 1;

        do {
            prev = current;
            current = current.next;
            count++;
            if (count == position) {
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
        DeleteANodeFromAnyPosition list = new DeleteANodeFromAnyPosition();
        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.insert(val);
        }
        System.out.println("Original list:");
        list.display();
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();
        list.deleteAtPosition(pos);
        System.out.println("List after deletion:");
        list.display();
    }
}
