class rotateL{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	void print(Node te){
		Node temp=te;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	void push(int de){
		Node new_node = new Node(de);
		new_node.next = head ;
		head = new_node ;
		
	}
	public void rot(int x){
		Node temp=null,prev=null,temp2=null;
		temp=head;
		for(int i=0;i<(x);i++){
			prev = temp;
			temp=temp.next;
			
		}
		temp2=temp;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next = head ;
		head = temp2;
		prev.next = null ;
		
		
	}
	public static void main(String args[]){
		rotateL list = new rotateL();
		list.push(60);
		list.push(50);
		list.push(40);
		list.push(30);
		list.push(20);
		list.push(10);
		System.out.println("INitially");
		list.print(head);
		list.rot(4);
		System.out.println("After");
		list.print(head);
	}
	
}