class Node{
	int key;
	Node left,right;
	Node(int d){
		key =d;
		left=right=null;
	}
}
class Isbst{
	Node root;
	Isbst(){
		root =null;
	}
	boolean bstcheckutil(Node node,int min,int max){
		if(node == null)return true;
		return(node.key<max && node.key>min && bstcheckutil(node.left,min,node.key)&&bstcheckutil(node.right,node.key,max));
		
	}
	boolean bstcheck(){
		return (bstcheckutil(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}
	public static void main (String[] args) {
		Isbst tree = new Isbst();
		tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        
        if(tree.bstcheck()) System.out.println("BST");
        else System.out.print("NOT BST");
}

	
}