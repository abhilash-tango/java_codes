class Doublylinkeddelete{
static	Node head;
static	class Node{
		int data;
		Node next,prev;
		Node(int d){
			data =d ;
			next = null;
			prev =null;
		}
	}
	public void push(int d){
		Node new_node = new Node(d);
		new_node.prev = null;
		new_node.next = head;
		if(head != null){
			head.prev = new_node;
		}
		head = new_node;
		
	}
	public void print(){
		Node temp =head;
		while (temp != null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void delete(Node del){
	
	
	if(del == head){
		head = head.next;
		head.prev = null ;
		
	}
	if(del.prev != null){
		del.prev.next = del.next;
	}
	if(del.next != null){
		del.next.prev = del.prev;
	}
	
}
public static void main (String[] args) {
	Doublylinkeddelete list = new Doublylinkeddelete();
	 	list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);
        list.print();
        list.delete(head);
        list.delete(head.next);
        list.delete(head.next);
        System.out.println(" ");
        list.print();
}
}