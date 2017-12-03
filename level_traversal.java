class Node{
	int key;
	Node left,right;
	Node(int d){
		key =d;
		left=right=null;
	}
}
class LevelTraversal{
	Node root;
	LevelTraversal(){
		root = null;
	}
	
	int height(Node node){
		if(node == null){
			return 0;
			
		}
		int lheight = height(node.left);
		int rheight = height(node.right);
		if (lheight > rheight){
			return (lheight+1);}
		else{
			return (rheight+1);
		}
					
		}
		void printLevel(Node node,int level){
			if(node == null){
				return;
			}
			if(level == 1){
				System.out.print(node.key+" ");
			}
			else {
				printLevel(node.left,level-1);
				printLevel(node.right,level-1);
			}
			
		}
		void printallLevel(){
			int h = height(root);
			for(int k=1;k<=h;k++){
				printLevel(root,k);
			}
		}
		public static void main (String[] args) {
			LevelTraversal tree = new LevelTraversal();
			   tree.root= new Node(1);
		       tree.root.left= new Node(2);
		       tree.root.right= new Node(3);
		       tree.root.left.left= new Node(4);
		       tree.root.left.right= new Node(5);
		       tree.printallLevel();
}
	}
