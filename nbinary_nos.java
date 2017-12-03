import java.util.*;class nbinary{
	Node front,rear;
	int length;
	nbinary(){
		front=rear=null;
		length = 0;
	}
	class Node{
		String data;
		Node next;
	
		Node(String d){
			data =d;
			next =null;
			
		}
	}
	public boolean isEmpty(){
		return (length == 0);
	}
	public void enqueue(String s){
		Node new_node = new Node(s);
		if(isEmpty()){
			front=rear=new_node;
		}
		else{
			rear.next =new_node;
			rear = new_node;
		}length++;
	}
	public void dequeue(){
		front=front.next;
		length--;
		
	}
	public String getfront(){
		return front.data;
	}
	public static void main (String[] args) {
		nbinary ab = new nbinary();
		ab.enqueue("1");
		int k =7;
		String s1,s2;
		while(k!=0){
			s1= ab.getfront();
			ab.dequeue();
			System.out.println(s1);
			s2=s1;
			s1=s1+"0";
			ab.enqueue(s1);
			s2=s2+"1";
			ab.enqueue(s2);
			k--;
			
		}
		
}
	}
