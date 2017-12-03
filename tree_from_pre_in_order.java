class Node{
	char key;
	Node left,right;
	Node(char  d){
		key =d;
		left=right=null;
	}
}
class TreeMake{
static	Node root;
	TreeMake(){
		root= null;
	}
	int preIndex=0;
	Node buildtree(char[] in,char[] pre, int Instrt,int Inend){
		
		if(Instrt>Inend){
			return null;
		}
		Node tnode = new Node(pre[preIndex++]);
		if(Instrt == Inend){
			return tnode;		}
			int preIndex=search(in,Instrt,Inend,tnode.key);
			 tnode.left=buildtree(in,pre,Instrt,preIndex-1);
			 tnode.right = buildtree(in,pre,preIndex+1,Inend);
			 return tnode;
		
	}
	int search(char[] in,int Instrt,int Inend,char data){
		int i;
		for(i=Instrt;i<=Inend;i++){
			if(in[i]==data){
				return i;
			}
		}return i;
	}
	void printInorder(Node node){
		if(node==null){
			return;
		}
		printInorder(node.left);
		System.out.print(node.key+" ");
		printInorder(node.right);
	}
	
public static void main (String[] args) {
	TreeMake tree = new TreeMake();
	    
        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        int len = in.length;
        Node mynode = tree.buildtree(in, pre, 0, len - 1);
        tree.printInorder(mynode);
	
}
}