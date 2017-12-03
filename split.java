class split{
	static Node head,head1,head2;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	void print(Node te){
		Node temp=te;
		do{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp != te);
		
	}
	void splitlist(){
		Node slow=head,fast =head;
		if (head == null){
			return ;
		}
		while(fast.next!=head && fast.next.next!=head){
			fast=fast.next.next;
			slow=slow.next;
		}
		if (fast.next.next == head){
			fast=fast.next;
		}
		head2=slow.next;
		head1=head;
		slow.next=head;
		fast.next=head2;
		
	}
	public static void main (String[] args) {
		split list = new split();
		list.head = new Node(12);
        list.head.next = new Node(56);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = list.head;
        System.out.println("Initially");
        list.print(head);
        list.splitlist();
        System.out.println("First List");
        list.print(head1);
        System.out.println("Second list");
        list.print(head2);
        
}
}