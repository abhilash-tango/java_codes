class nextGreater{
	Node top;
	int length;
	public nextGreater(){
		
		length = 0;
		top = null;
	}
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int d){
		Node new_node = new Node(d);
		new_node.next = top ; 
			top = new_node;
			length++;
		
	}
	public int  pop(){
		Node temp=top;
		top = top.next;
		length--;
		return temp.data;
	
	}
	public int peek(){
		return (top.data);
	}
	public boolean isEmpty(){
		return (length == 0);
	}
	public static void main(String args[]) throws java.lang.Exception{
		nextGreater ab =new nextGreater();
		int[] a = {13, 7, 6, 12};
		for (int i=0;i<a.length;i++){
			ab.push(a[i]);
			for(int j=i;j<a.length;j++){
			
			if (ab.peek()<a[j]){
				System.out.println(ab.peek()+"next"+a[j]);
				ab.pop();
				break;
			}}
			
			
			
		}
		while(!ab.isEmpty()){
			System.out.println(ab.pop()+"next-1");
		}
		
	}
}