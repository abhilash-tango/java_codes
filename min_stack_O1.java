class minStack{
	Node top1,top2;
	int length1,length2;
	int c=0;
	minStack(){
		top1=null;
		top2=null;
		
		length1=0;
		length2 = 0;
	}
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next =null;
		}
	}
	public void pop(){
		top1 = top1.next;
		top2 = top2.next;
		length1--;
		length2--;
	}
	public int getMin(){
		return top2.data;
		
	}
	public void push(int d){
		Node new_node1 = new Node(d);
		Node new_node2;
		
		new_node1.next =top1;
		top1=new_node1;
		if(length1 == 0){
			 new_node2= new Node(d);
			new_node2.next = top2;
			top2 = new_node2;
		}
    	else	if(d<top2.data){
		
	 new_node2 = new Node(d);
	 new_node2.next =top2;
		top2 = new_node2;
		}
		else if (d >=  top2.data){
		 new_node2 = new Node(top2.data);
		 new_node2.next =top2;
		top2 = new_node2;
		}
	length1++;
	length2++;	
	c++;		
		
	}
	public static void main (String[] args)  {
		
		minStack ab = new minStack();
		ab.push(10);
		ab.push(20);
		ab.push(5);
		System.out.print(ab.getMin()+" ");
		ab.pop();
		ab.push(0);
		System.out.print(ab.getMin()+" ");
		
		
}
}