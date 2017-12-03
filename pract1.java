class pract1
{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null ;
		}
	}
	
	public void push(int da){
		
		Node new_node = new Node(da);
		new_node.next = head ;
		head = new_node ;
		
		
	}
	public void print(){
		Node tnode;
		tnode= head;
		while (tnode != null){
			System.out.println(tnode.data+" ");
			tnode = tnode.next;
		}
		
	}
	public static void main (String[] args) {
		pract1 llist = new pract1();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.print();
}
}