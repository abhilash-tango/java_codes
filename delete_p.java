class delete
{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
			
			
		}
		
	}
	public void push(int da){
		Node new_node = new Node(da);
		new_node.next = head ;
		head = new_node;
		
	}
	public void delete(int key){
		Node temp=head;Node pev=null;
		if(temp.data == key && temp != null){
			head = temp.next;
			return;
		}
		while(temp.data != key && temp != null){
			pev = temp;
			temp=temp.next;
			
		}
		if(temp!= null){
			pev.next = temp.next;
			return;
		}
		else{
			return;
		}
			
	}
	public void printlist(){
		Node temp;
		temp = head;
		while(temp != null){
			System.out.println(temp.data+"");
			temp = temp.next;
			
		}
	}
	public static void main (String[] args) {
		delete llist = new delete();
		llist.push(2);
		llist.push(3);
		llist.push(5);
		llist.push(6);
		llist.delete(3);
		llist.printlist();
		
}
}