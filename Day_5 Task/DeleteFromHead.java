package dsa;

public class DeleteFromHead {

    Node last;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public DeleteFromHead() {
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
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
        }
    }

    public void Display() {
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
        DeleteFromHead a = new DeleteFromHead();

        a.insert(10);
        a.insert(20);
        a.insert(30);
        a.insert(40);

        System.out.println("Original List:");
        a.Display();

        a.deleteHead();
        System.out.println("After deleting head:");
        a.Display();
    }
}
