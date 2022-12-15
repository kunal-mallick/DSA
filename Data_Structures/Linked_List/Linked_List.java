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
	
	public void append(int value){
		
		Node newnode = new  Node(value);
		if(lenght == 0) {
			head = newnode;
			tail = newnode;
		}
		else {
			tail.nest = newnode;
			tail = newnode;
		}
		lenght++;
		
	}
	
	public Node removeLast() {
		
		if(lenght == 0) {
			return null;
		}
		
		Node temp = head;
		Node pre = head;
		while(temp.nest != null) {
			
			pre = temp;
			temp = temp.nest;
		}
		
		tail = pre;
		tail.nest = null;
		lenght--;
		
		if(lenght ==0) {
			head = null;
			tail = null;
		}
		
		return temp;
	}
	
	public void prepend(int value) {
		
		Node newnode = new Node(value);
		
		if(lenght == 0) {	
			head = newnode;
			tail = newnode;
		}
		else {
			newnode.nest = head;
			head = newnode;
		}
	}
	
	
}






















