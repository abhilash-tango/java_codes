/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
       Scanner ab = new Scanner(System.in);
       int x= ab.nextInt();
       while(x!=0){
       	String s = ab.next();
       	for(int i=s.length()-1;i>=0;i--){
       		System.out.print(s.charAt(i));
       	}
       	x--;
       }
        
    }
}
