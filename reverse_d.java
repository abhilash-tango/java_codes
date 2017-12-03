class reverseD{
	static Node head;
	static class Node{
		Node next;
		Node prev;
		int data;
		Node(int d){
			data=d;
			prev = next = null;
			
		}
	}
	void reverse(){
		Node temp = null;
		Node current = head ;
		while(current != null){
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		 if (temp != null) {
            head = temp.prev;
        }
		
	}
	void add(int de){
		Node new_node = new Node(de);
		new_node.prev = null;
		new_node.next=head;
		if (head != null) {
            head.prev = new_node;
        }
		head = new_node;
	}
	void print(Node node){
		Node tempo;
		tempo = node;
		while(tempo != null){
			System.out.print(tempo.data+" ");
			tempo = tempo.next;
		}System.out.println();
	}
	public static void main (String[] args) {
		reverseD ab = new reverseD();
		ab.add(10);
		ab.add(8);
		ab.add(4);
		ab.add(2);
		ab.print(head);
		ab.reverse();
		ab.print(head);
}
	
	
}