import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Solution {
    Node top;
    int length;
    public Solution(){
        length=0;
        top=null;
    }
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null ;
        }}
        public void push(int d){
            Node new_node = new Node(d);
            new_node.next = top;
            top = new_node;
            length++;
        }
        public void pop(){
            top = top.next;
            length--;
        }
        public int max(){
            Node temp = top;
            int c=Integer.MIN_VALUE;
            while(temp != null){
                if(temp.data >c){
                    c=temp.data;
                    
                }temp=temp.next;
                
            }return c;
        }
    public void print(){
        Node tempo =top;
        while (tempo!= null){
            System.out.println(tempo.data);
            tempo=tempo.next;
        }
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ag = new Scanner(System.in);
        Solution ab = new Solution();
        int a = ag.nextInt();
        int d=1;
        int k,g;
        while(a != 0){
            k=ag.nextInt();
            if(k == 1){
                g=ag.nextInt();
                ab.push(g);
                
            }
            else if(k==2){
                ab.pop();
            }
            else if(k ==3){
                System.out.println(ab.max());
            }
            
            a--;
        }
    }
}