class Node{
	int key;
	Node left,right;
	Node(int d){
		key=d;
		left=right=null;
	}
}
class Subtree{
static	Node root1,root2;
	Subtree(){
		root1 = null;
		root2 =null;
	}
	boolean IsSubtree(Node T,Node S){
		if(T==null ){
			return false;
		}
		if(S==null){
			return true;
			
		}
		if(Identical(T,S)){
			return true;
		}
		return(T.key == S.key || IsSubtree(T.left,S)||IsSubtree(T.right,S));
		
	}
	boolean  Identical(Node T,Node S){
		if(T== null && S== null){
			return true;
			
		}
		if(T==null || S== null){
			return false;
		}
		return (T.key == S.key && T.left == S.left && T.right == S.right);
	}
	public static void main (String[] args) {
		Subtree tree = new Subtree();
		tree.root1 = new Node(26);
        tree.root1.right = new Node(3);
        tree.root1.right.right = new Node(3);
        tree.root1.left = new Node(10);
        tree.root1.left.left = new Node(4);
        tree.root1.left.left.right = new Node(30);
        tree.root1.left.right = new Node(6);
        boolean  l=tree.IsSubtree(root1,root2);
        if(l){
        	System.out.print("Yes");
        	
        }else{
        	System.out.print("No");
        }
        
}
}