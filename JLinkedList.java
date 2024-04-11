class JLinkedList<T>{
	public void insertEnd(T data){
		Node newNode = new Node(data);
		newNode.next = null;
		Node temp = this.head;
	}
	public void printList(){
		Node currNode = this.head.next;
		System.out.println("LinkedList: ");
		while(currNode != null){
			System.out.println(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}
}