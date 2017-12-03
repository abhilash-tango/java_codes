class LinkedLo
{
	static class Node
	{
		int data; Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
		
	}
	public void print()
	{
		Node lol= head;
		while(lol != null){
			System.out.print(lol.data+" ");
			lol= lol.next;
			
		}
	}
	public void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node; 
	}
	public void delete(int key)
	{
		Node temp=head,prev=null;
		if(temp != null && temp.data == key)
		{
			head = temp.next;
			return;
		
		}
		while(temp != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)return;
		prev.next = temp.next;
		
	}
	Node head;
	public static void main (String[] args) {
		
		LinkedLo llistt = new LinkedLo();
	    llistt.push(1);
	    llistt.push(2);
	    llistt.push(3);
	    llistt.push(4);
	    llistt.push(5);
	    llistt.print();
	    llistt.delete(1);
	    llistt.print();
		
}
}