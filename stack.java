class stacko{

	 final int lengtho = 5;
	 int length;
	static Node top;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public stacko(){
		length = 0 ; 
		top = null;
	}
	public void push(int data)throws Exception{
		if(isFull()){
			
			throw new Exception("Stack is full");
		}
		
		Node new_node = new Node(data);
		new_node.next = top ; 
		top = new_node;
		length++ ; 
	}
	public int size(){
		return length;
	}
	public void  pop() throws Exception {
		if(isEmpty()){
		throw new Exception("Stack is empty");
		}
	    
		
		top = top.next;
		length--;
	
	    }
		
	public int peek(){
		Node temp = top;
		int d = top.data;
		return d;
	}	
	public boolean isFull(){
		return(size() == lengtho);
	}
	public boolean isEmpty(){
		return (length == 0);
	}
	public void print(){
		Node temp = top;
		while(temp != null){
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main (String[] args) {
		stacko ab = new stacko();
	
		try{
		
		ab.push(2);
		ab.push(3);
		ab.push(4);
		ab.print();
		ab.pop();
		ab.print();
		System.out.println(ab.peek());
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		
}
}