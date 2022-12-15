package doublyLinkedList;

public class doublyLinkedList {
	Node head;
	Node tail;
	int lenght;
	
	public doublyLinkedList(int value) {
		Node newnode = new  Node(value);
		head = newnode;
		tail = newnode;
		lenght = 1;
	}
	
	public void pirntList() {
		
		Node temp = head;
		System.out.print("\n");
		while(temp != null) {
			
			System.out.print(" "+temp.value);
			temp= temp.nest;
		}
	}
	
	public void getHead() {
		
		System.out.println(" Head : "+ head.value);
	}
	
	public void getTail() {
		
		System.out.println(" Tail : "+tail.value);
	}
	
	public void getLenght() {
		
		System.out.println(" Lenght : "+lenght);
	}
}
