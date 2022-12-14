package Linked_List;

public class Linked_List {
	
	Node head;
	Node tail;
	int lenght;
	
	public Linked_List(int value) {
		Node newnode = new  Node(value);
		head = newnode;
		tail = newnode;
		lenght = 1;
	}
	
	public void pirntList() {
		
		Node temp = head;
		while(temp != null) {
			
			System.out.println(temp.value);
			temp= temp.nest;
		}
	}

}

