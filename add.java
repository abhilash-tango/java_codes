class add{
	static Node head1,head2;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data =d ;
			next =null ;
		}
	}
	Node addlist(Node first, Node second){
		Node prev =null,temp =null,res =null;
		int sum,carry=0;
		while(first != null || second != null){
		
		sum=carry+(first!= null?first.data:0)+(second != null?second.data:0);
		carry = (sum>=10?1:0);
		sum = sum%10;
		temp = new Node(sum);
		if (res == null){
			res = temp;
		}else{
			prev.next = temp;
		}
		prev = temp;
		if(first !=null ){
			first = first.next;
		}
		if(second != null){
			second=second.next;
		}
		}
		if(carry>0){
			temp = new Node(carry);
			prev.next = temp;
		}
		return res;
		
	}
	public void print(Node te)
	{
		Node temp =te;
		while (temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}
	}
	public static void main (String[] args) {
		add list = new add();
		list.head1 = new Node(7);
		list.head1.next = new Node(5);
		list.head1.next.next = new Node(9);
		list.head1.next.next.next = new Node(4);
		list.head1.next.next.next.next=new Node(6);
		System.out.println("First list");
		list.print(head1);
		list.head2 = new Node(8);
		list.head2.next = new Node(4);
		list.head2.next.next= new Node(8);
		list.head2.next.next.next = new Node(9);
		list.head2.next.next.next.next = new Node(9);
		list.head2.next.next.next.next.next = new Node(9);
		
		System.out.print("Second list");
		list.print(head2);
		System.out.print("Third list");
		Node res = list.addlist(head1,head2);
		list.print(res);
		
		
}
}