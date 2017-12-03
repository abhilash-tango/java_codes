class loop{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int nd){
		Node new_node = new Node(nd);
		new_node.next = head ;
		head = new_node ;
		
	}
	 void print(){
		Node temp ;
		temp =head ;
		while (temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
   	 int dloop(Node node){
		Node slow = node,fast = node ;
		int l=0;
		while (slow != null && fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow ==  fast){
				
				removeloop(slow,node);
				return 1;
			}
			
		}
		
		return 0;
	}
	void removeloop(Node k,Node m){
		Node ptr1 = null , ptr2 = null ;
		ptr1 = k;
		ptr2 = k ;
		int p=1;
		while(ptr1.next != ptr2){
			p++;
			ptr1=ptr1.next;
		}
		ptr1=m;
		ptr2=m;
		for(int i =0;i<p;i++){
			ptr2=ptr2.next;
		}
		while(ptr1 != ptr2){
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		
		while(ptr2.next != ptr1){
			ptr2=ptr2.next;
		}
		ptr2.next =null;
		
		
	}
	public static void main (String[] args) {
		int x=0;
		loop lis = new loop();
		lis.push(50);
		lis.push(20);
		lis.push(15);
		lis.push(4);
		lis.push(10);
		head.next.next.next.next.next = head.next.next;
	     x=lis.dloop(head);
		lis.print();
		
		
		
		
}
	
}