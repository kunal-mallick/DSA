package Linked_List;

public class main {

	public static void main(String[] args) {
		
		Linked_List ll = new Linked_List(11);
		
		ll.append(3);
		ll.append(23);
		ll.append(7);
		ll.append(4);
		
		ll.getHead();
		ll.getTail();
		ll.getLenght();
		ll.pirntList();
		
		System.out.print("\n Remove last: "+ll.removeLast().value);
		ll.pirntList();
		
		ll.prepend(4);
		ll.pirntList();
	}

}
