import java.util.Scanner;
class rev{
	static Node top;
	int length;
	public rev(){
		length =0;
		top=null;
	}
	static class Node{
		char data;
		Node next;
		Node(char d){
			data = d;
			next = null;
		}
	}
	public void push(char c){
		Node new_node = new Node(c);
		new_node.next =top;
		top = new_node;
		length++;
	}
	public char pop(){
		char t =top.data;
		top=top.next;
		length--;
		return t;
	}
	public void print(){
		Node temp = top;
		while (temp != null){
			System.out.print(temp.data);
			temp=temp.next;
		}
		
	}
	public boolean isEmpty(){
		return (length == 0);
		
	}
	public static void main (String[] args) {
		rev ab = new rev();
		String res="";
		Scanner de = new Scanner(System.in);
		String cd = de.next();
		for(int i=0 ; i< cd.length();i++){
			ab.push(cd.charAt(i));
		}
		while(!ab.isEmpty()){
			res=res+ab.pop();
		}
		System.out.print(res);
	
}
}