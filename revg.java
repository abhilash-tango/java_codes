class revgr{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next = null;
		}
	}
	public void push(int data1){
		Node new_node = new Node(data1);
		new_node.next = head;
		head = new_node;
		
		
	}
	public void rev(int x){
		
		
		
	}
	public void print(){
		Node temp= head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}System.out.println();
		
	}
	public static void main (String[] args) {
		revgr lola =  new revgr();
		lola.push(1);
		lola.push(2);
		lola.push(3);
		lola.push(4);
		lola.push(5);
		lola.push(6);
		lola.print();
}
}