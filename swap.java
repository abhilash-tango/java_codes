class swap
{
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next= null;		
		}
		
		
	}
	Node head;
	public void push(int y)
	{
		Node new_node = new Node(y);
		new_node.next = head ;
		head = new_node;
	}
	public void print()
	{
		Node temp=head;
		while (temp != null)
		{
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}System.out.println("");
	}
	public void swap(int x, int y){
		if(x==y)return;
		Node temp1=head,temp2=head,temp3=null,temp11=null,temp22=null;
		int c=0,t=0;
		while(c != x && temp1 != null){
			c++;
			temp11=temp1;
			temp1=temp1.next;
			
		}
		while(t != y && temp2 != null){
			temp22=temp2;
			t++;
			temp2=temp2.next;
			
		}
		if( x!=0)
		{
		temp11.next = temp2;
			
		}
		else{temp2.next = head.next;
			temp1.next = temp2.next;
			temp22.next = temp1;
		}
	
		if(y!=0)
		{
			temp22.next = temp1;
		}
		else
		{
			temp1.next = head.next;
			temp2.next = temp1.next;
			temp11.next = temp2;
		}
	
	
		System.out.println(temp1.data);
		System.out.println(temp2.data);
		
		if(x!= 0 && y!= 0)
		{
		
		temp3 = temp1.next;
		temp1.next = temp2.next;
		temp2.next =temp3;
		
		}
		
		
	}
	public static void main (String[] args) {
		
		swap lol = new swap();
		lol.push(1);
	    lol.push(2);
	    lol.push(3);
	    lol.push(4);
	    lol.push(5);
	    lol.print();
	    lol.swap(0,4);
	    lol.print();
		
}
}