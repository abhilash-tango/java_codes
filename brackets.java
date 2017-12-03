import java.util.Scanner;
class bracko{
	static Node top;
	static int length;
	public bracko(){
		length = 0 ;
		top = null;
	}
	static class Node{
		char  data;
		Node next;
		Node(char d){
			data = d ;
			next = null;
		}
	}
	public boolean isEmpty(){
		return (length == 0);
	}
	public static  void push(char de){
		Node new_node = new Node(de);
		new_node.next = top;
		top = new_node;
		length++;
	}
	public void pop(){
		top = top.next;
		length--;
	}
	public char peek(){
		return top.data ;
	}
	public static void main (String[] args) {
		Scanner inpo = new Scanner(System.in);
		String ab = inpo.next();
		bracko list = new bracko();
		for(int i=0; i< ab.length();i++){
			if((ab.charAt(i)) == '}' && !list.isEmpty() && list.peek() == '{'){
				list.pop();
			}
			else if((ab.charAt(i)) == ']' && !list.isEmpty() && list.peek() == '[' ){
				list.pop();
			}
			else if((ab.charAt(i)) == ')' && !list.isEmpty() && list.peek() == '('){
				list.pop();
			}
			else if((ab.charAt(i)) == '[' || (ab.charAt(i)) == '{' || (ab.charAt(i)) == '(') {
				push(ab.charAt(i));
			}
		}
		if(list.length == 0){
			System.out.println("Balanced");
		}
		else{
			System.out.println("Not balanced");
		}
		
}
}