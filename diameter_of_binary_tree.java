import java.math.*;
class Node{
	int key;
	Node left,right;
	Node(int d){
		key =d;
		left=right=null;
	}
}
class diameter{
	static Node root;
	diameter(){
		root =null;
	}
	int diameterOf(Node node){
		if(node == null){
			return 0;
		}
		int lheight=height(node.left);
		int rheight = height(node.right);
		int ldiameter = diameterOf(node.left);
		int rdiameter = diameterOf(node.right);
		return (Math.max(lheight+rheight+1,Math.max(ldiameter,rdiameter)));
	}
	int height(Node node){
		if(node == null){
			return 0;		}
			return (1+Math.max(height(node.left),height(node.right)));
			
	}
	public static void main (String[] args) {
		diameter tree = new diameter();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("The diameter of given binary tree is : "
                           + tree.diameterOf(root));
}
}