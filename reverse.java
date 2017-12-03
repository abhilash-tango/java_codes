class reverse
{	static Node head;
	 static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
	
	public void push(int data1){
		Node new_node = new Node(data1);
		new_node.next = head;
		head = new_node;
	}
	public void print(Node lola)
	{
	
		
		while(lola != null){
			System.out.print(lola.data+" ");
			lola = lola.next ;
		}
		
	}
   Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
	public static void main (String[] args) {
		reverse lol = new reverse();
		lol.push(1);
		lol.push(2);
		lol.push(3);
		lol.push(4);
		lol.push(5);
		lol.push(6);
		lol.print(head);
		
		head = lol.reverse(head);
		lol.print(head);
}
}