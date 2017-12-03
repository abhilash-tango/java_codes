import java.util.*;
class Stackol{
	public static void main (String[] args) {
		Stack<Integer> ab = new Stack<Integer>();
		Scanner ag =new Scanner(System.in);
		int k = ag.nextInt();
		int m ;
		int g;
		
		while(k!=0){
			m = ag.nextInt();
			if(m == 1){
                g=ag.nextInt();
                ab.push(g);
                
            }
            else if(m==2){
                ab.pop();
            }
            else if(m ==3){
                while(!ab.isEmpty()){
                
                System.out.println(ab.peek());ab.pop();}            }
			k--;
		}
}
}