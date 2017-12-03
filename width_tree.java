class Node{
	int key;
	Node left,right;
	Node(int d){
		key=d;
		left=right=null;
	}
}
class Width{
static	Node root;
	Width(){
		root =null;
	}
	
	int Findwidth(Node node){
		int heig = height(node);
		int maxwidth =Integer.MIN_VALUE;
		int width;
		for(int i=1;i<heig;i++){
			width=width(node,i);
			if(width>maxwidth){
				maxwidth=width;
			}
			
		}return maxwidth;
	}
	int width(Node node,int level){
		if(node == null){
			return 0;
		}
		if(level == 1){
			return 1;
		}
		else if(level>1){
			return (width(node.left,level-1)+width(node.right,level-1));
		}return 0;
	}
	int height(Node node){
		if(node==null){
			return 0;
		}else{
			int lheight = height(node.left);
			int rheight =height(node.right);
			return (rheight>lheight?rheight+1:lheight+1);
		}
	}
		public static void main (String[] args) {
			Width tree = new Width();
			tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);
 
        System.out.println("Maximum width is " + tree.Findwidth(root));
}
	
}