class queue {
	Node front,rear;
	int length ;
	queue(){
		front=null;
		rear=null;
		length =0;
	}
	class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next =null ;
		}
	}
	public void enqueue(int d){
		Node new_node = new Node(d);
		Node temp;
		
		if(isEmpty()){
		    rear =front = new_node;
		}
		else{
		rear.next = new_node;
		rear = new_node;
			
		}
	length++;	
	}
	public void dequeue(){
		if(!isEmpty()){
		
		front = front.next;
		length--;}
		
	}
	public boolean isEmpty(){
		return (length == 0);
	}
	public void print(){
		Node temp = front;
		while(temp!= null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main (String[] args) {
		queue ab = new queue();
		ab.enqueue(24);
		ab.enqueue(26);
		ab.enqueue(245);
		ab.print();
		ab.dequeue();
		ab.print();
		
}
}