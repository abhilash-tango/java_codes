class sort{
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int d){
			data=d;
			next = null;
		}
		
	}
	void print(Node te){
		Node temp = te;
		do{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!= te);
	}
	void insert(Node new_node){
		Node curr = head,temp=head ;
		if (head == null){
			head = new_node;
			new_node.next = new_node;
		
			}
			if(curr.data > new_node.data){
				do{
					temp=temp.next;
				}while(temp!=head);
			new_node.next = head;
			head = new_node;
			temp.next =new_node;	
			}
			else{
				while(curr.next.data < new_node.data){
					curr=curr.next;
				}
				new_node.next =curr.next;
				curr.next = new_node;
				
			}
			
		
	}
	public static void main (String[] args) {
		sort list = new sort();
		list.head = new Node(2);
        list.head.next = new Node(5);
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(10);
        list.head.next.next.next.next = list.head;
        Node neya = new Node(7);
        list.print(head);
        list.insert(neya);
        list.print(head);
}
}