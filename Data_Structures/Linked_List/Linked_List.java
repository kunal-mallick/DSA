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
		lenght++;
	}
	
	public Node removeFirst() {
		
		if(lenght == 0) {
			return null;
		}
		
		Node temp = head;
		head = head.nest;
		tail.nest = null;
		lenght--;
		
		if(lenght == 0) {
			tail = null;
		}
		return temp;
	}
	
	public Node get(int index) {
		if(index < 0 || index >= lenght) {
			return null;
		}
		Node temp = head;
		for(int x = 0; x < index; x++) {
			temp = temp.nest;
		}
		return temp;
	}
	
	public boolean set(int index, int value) {
		Node temp = get(index);
		if(temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int value) {
		if (index < 0 || index >= lenght) {
			return false;
		}
		
		if(index == 0) {
			prepend(value);
			return true;
		}
		
		if(index == lenght) {
			append(value);
			return true;
		}
		
		Node newnode =new Node(value);
		Node temp = get(index - 1);
		newnode.nest = temp.nest;
		temp.nest = newnode;
		lenght++;
		return true;
	}
	
	public Node remove(int index) {
		
		if(index < 0 || index >= lenght) {
			return null;
		}
		
		if(index == lenght-1) {
			return removeLast();
		}
		
		if(index == 0) {
			return removeFirst();
		}
		
		Node pre = get(index-1);
		Node temp = pre.nest;
		pre.nest = temp.nest;
		temp.nest = null;
		lenght--;
		return temp;
	}
	
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.nest;
		Node before = null;
		for(int x = 0; x < lenght; x++) {
			after = temp.nest;
			temp.nest = before;
			before = temp;
			temp = after;
		}
	}
}