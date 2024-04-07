package Demo;

public class LinkedList1 {
	Node1 head;
	public void insert(int data) {
	Node1 node = new Node1();
	// INSERT AT BEGINNING
//	node.next = head;
//	head = node;
//	node.data = data;
	// INSERT AT END
	node.data  = data;
	node.next = null;
	if(head == null) {
		head = node;
	} else {
		Node1 n = head;
		while(n.next != null) {
			n = n.next;
		}
		n.next = node;
	}
}
	
	public void show() {
		Node1 node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next; 
		}
		System.out.println(node.data);
	}
}
