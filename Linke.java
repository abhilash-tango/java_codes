// Java program for reversing the linked list
 
class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
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
    public void push(int data1){
		Node new_node = new Node(data1);
		new_node.next = head;
		head = new_node;
	}
 
    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
		 list.push(2);
		  list.push(3);
		   list.push(4); list.push(5);
        System.out.println("Original Linked list is :");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list : ");
        list.printList(head);
    }
}
