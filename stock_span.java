import java.util.*;
class span{
	
	void spano(int[] a,int[] s){
		s[0]=1;
		Stack<Integer> ak = new Stack<Integer>();
		ak.push(0);
		for(int i=1;i<a.length;i++){
			while(!ak.isEmpty() && a[i] >= a[ak.peek()]){
			
				ak.pop();}
				s[i]=((ak.isEmpty())?i+1:i-ak.peek());
		ak.push(i);
	}}
	public static void main (String[] args) {
		int[] a = {10, 4, 5, 90, 120, 80};
		int[] s = new int[a.length];
		
		span ab = new span();
		ab.spano(a,s);
		for(int i =0;i<s.length;i++){
			System.out.print(s[i]+" ");
		}
}
}