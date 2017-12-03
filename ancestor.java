class Node{
	int key;
	Node left,right;
	Node(int d){
		key=d;
		left=right=null;
	}
}
class Ancestors{
static	Node root;
	Ancestors(){
		root = null;	}
		boolean printAncestors(Node node,int data){
			if(node==null){
				return false;
			}
			if(node.key == data){
				return true;
			}
			if(printAncestors(node.left,data)|| printAncestors(node.right,data)){
				System.out.print(node.key+" ");return true;
			}return false;
		}
		public static void main (String[] args) {
			Ancestors tree = new Ancestors();
			tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);
        tree.printAncestors(root,7);
 
}
}