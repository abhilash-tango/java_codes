class Stackmiddle{
	Node head,middle;
	int count;
	Stackmiddle(){
		count = 0;
	}
	class Node{
		int data;
		Node next,prev;
		Node(int d){
			data =d ;
			next =null;
			prev= null;
		}
	}
	public void push(int d){
		Node new_node = new Node(d);
		new_node.next = head;
		new_node.prev = null;
		if(head != null){
			head.prev = new_node;
		}
		head= new_node;
		count++;
		if(count == 1){
			middle = head;
		}
		else if(count != 1 && count%2 != 0 && count>2 ){
		middle = middle.prev; //draw diagram to understand this
		}
	}
	public void pop(){
		if(count > 0){
		
		head = head.next;
		head.prev= null;
		count--;
		if(count%2 == 0){
			middle = middle.next;
		}
		}	count--;
	}
	public int middleE(){
	
		return middle.data;
	}
	public static void main (String[] args) {
		Stackmiddle list = new Stackmiddle();
		list.push(2);
		list.push(5);
		list.push(46);
		list.push(35);
		list.push(24);
		
		
		System.out.println(list.middleE());
		list.pop();
		System.out.println(list.middleE());
}
}