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
	
	public void insertAtStart(int data) {
		Node1 node1 = new Node1();
		node1.data = data;
		node1.next = null;
		node1.next = head;
		head = node1;
	}
	
	public void insertAt(int index, int data) {
		Node1 node = new Node1();
		node.data = data;
		node.next = null;
		if(index == 0) {
			insertAtStart(data);
		}
		Node1 n = head;
		for(int i=0; i<index-1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}
}
