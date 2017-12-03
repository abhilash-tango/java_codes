class Loop{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int de){
		Node new_node = new Node(de);
		new_node.next = head;
		head = new_node;
	}
	public void print(){
		Node temp ;
		temp =head;
		while (temp != null)
		{
			System.out.println(temp.data + " ");
			temp=temp.next;
		}
		
	}
	public static void main (String[] args) {
		Loop lol=new Loop();
		lol.push(1);
	    lol.push(2);
	    lol.push(3);
	    lol.push(4);
	    lol.push(5);
	    lol.print();
}
}