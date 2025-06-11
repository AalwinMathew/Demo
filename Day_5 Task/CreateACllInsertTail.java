package dsa;



public class CreateACllInsertTail {

	

	    Node last;



	    class Node {

	        int data;

	        Node next;



	        Node(int val) {

	            data = val;

	            next = null;

	        }

	    }



	    public CreateACllInsertTail() {

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



	    public void Display() {



	        Node temp = last.next; 

	        do {

	            System.out.print(temp.data + " ");

	            temp = temp.next;

	        } while (temp != last.next);

	        System.out.println();

	    }



	    public static void main(String[] args) {
	        CreateACllInsertTail a = new CreateACllInsertTail();

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

	    



		public void deleteHead() {
			
			
		}

	}

