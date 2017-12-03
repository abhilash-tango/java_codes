import java.util.Scanner;
import java.lang.*;
class testo{
	public static void main (String[] args) {
		String a;
		Scanner ab = new Scanner(System.in);;
		String b="";
		
        char d = ' ';
		while (!(b.equals("exit"))){
			 a= ab.next();
			 d=a.charAt(0);
			 if ( d >= 'f'){
			 	System.out.println("yes");
			 		System.out.println(d >= 'f');
			 }
			 else{
			 	System.out.println("no");
			 }
			System.out.println("press 'exit' to exit");
			b= ab.next();
			
		
		}
}
}

