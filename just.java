class just{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next=null;
		}
	}
	public void push(int nd){
		Node new_node = new Node(nd);
		new_node.next = head ;
		head = new_node;
	}
	public void print(){
		Node temp;
		temp = head ;
		while(temp != null){
			System.out.print(temp.data);
			temp=temp.next;
			
		}
	}
	public static void main (String[] args) {
		just lis = new just();
		lis.push(4);
		lis.push(5);
		lis.print();
}
}