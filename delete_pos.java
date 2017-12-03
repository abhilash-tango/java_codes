class Linkedp
{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public void push(int de){
		Node new_node = new Node(de);
		new_node.next = head;
		head = new_node ;
		
	}
	public void print()
	{
		 Node tempo = head;
		while (tempo != null)
		{
			System.out.print(tempo.data+" ");
			
			tempo=tempo.next;
		}System.out.println(" ");
	}
	public void delpos(int x)
	{
		Node tempr=head,use = null;
		
		if (x==0)
		{
			head=head.next;
			return;
		}
		for (int i=1; i<= x; i++)
		{
			use = tempr;
			tempr = tempr.next;
		}
		if (tempr == null)return;
		use.next=tempr.next;
	}
	public static void main (String[] args) {
		Linkedp lol = new Linkedp();
		lol.push(1);
	    lol.push(2);
	    lol.push(3);
	    lol.push(4);
	    lol.push(5);
	    lol.print();
	    lol.delpos(4);
	    lol.print();
		
}
	
}