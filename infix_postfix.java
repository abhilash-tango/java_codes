import java.util.Scanner;
class infi{
	Node top;
	 int length;
	public infi(){
		length = 0;
		top=null;
	}
	class Node{
		char data;
		Node next;
		Node(char d){
			data=d;
			next=null;
		}
		
	}
	public void push(char c){
		Node new_node = new Node(c);
		new_node.next = top ;
		top =new_node;
		length++;
		
	}
	public boolean isChar(char ac){
		return ((ac >= 'a' && ac <= 'z') || (ac >= 'A' && ac  <= 'Z'));
		
	}
	
	public void pop(){
		top = top.next;
		length--;
	}
	public char peek(){
		char temp;
		temp = top.data;
		return temp;
	}
	public void print(){
		Node temp;
		temp = top;
		while(temp != null){
			System.out.print(temp.data);
			temp= temp.next;
		}
	}
	public int operator(char c){
		switch(c){
			case '+':
			case '-':
				return 1;
			case '*':
			case '^':
				return 2;
			default:
				return 0;
		}
	}
	public boolean isEmpty(){
		if(length == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main (String[] args) {
		String cd;
		String result="";
		infi ab = new infi();
		Scanner st = new Scanner(System.in);
		cd = st.next();
		char al;
		for(int i =0;i<cd.length();i++){
			al=cd.charAt(i);
			if (ab.isChar(al)){
				System.out.print(al);
			}
			else if((ab.operator(al)) > 0 || ab.isEmpty()){
				if((ab.isEmpty()) || (ab.operator(al)) > ab.operator(ab.peek())  ){
					ab.push(al);
				}
				else{
					while(!(ab.isEmpty()) || (ab.operator(al)) <= ab.operator(ab.peek())){
						System.out.print(ab.peek());
						ab.pop();
						ab.push(al);
					}
				}
			}
			else if(al == '('){
				ab.push(al);
			}
			else if (al == ')'){
				while((!ab.isEmpty()) && (ab.peek() != '(')) {
					System.out.print(ab.peek());
					ab.pop();
				}
			}
			 if(i == (cd.length()-1)){
				ab.print();
			}
			
			
		}
		
		
		
		
}
}