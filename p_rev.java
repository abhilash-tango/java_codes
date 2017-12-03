class reversea{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next= null;
		}
	}
	public void push (int ndata){
		Node new_node = new Node(ndata);
		new_node.next = head ;
		head =new_node;
		
	}
	public void print()
		{
		Node tempo = head ;
		while (tempo != null){
			System.out.print(tempo.data+" " );
			tempo=tempo.next;
		}System.out.println("");
		
	}
	public Node rever(Node note){
		Node current = note,next=null,prev=null;
		while(current !=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}note = prev;
		return note;
	}
	public static void main (String[] args) {
		reversea lol = new reversea();
		lol.push(1);
		lol.push(2);
		lol.push(3);
		lol.push(4);
		lol.push(5);
		lol.print();
		head = lol.rever(head);
		lol.print();
		
		
}
	}
