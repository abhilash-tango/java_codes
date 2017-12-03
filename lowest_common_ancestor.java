	class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}class lca{
		static Node root;
		lca(){
			root=null;		}
			Node lcaFind(Node root,Node r1,Node r2){
				if(root==null)return null;
				if(root==r1)return r1;
				if(root == r2)return r2;
				Node left = lcaFind(root.left,r1,r2);
				Node right = lcaFind(root.right,r1,r2);
				if(left != null && right != null)return root;
				if(left == null && right == null)return null;
				return(left!=null?left:right);
			}
			public static void main (String[] args) {
				lca tree = new lca();
				tree.root = new Node(3);
				tree.root.left = new Node(6);
				tree.root.left.left = new Node(2);
				tree.root.left.right = new Node(11);
				tree.root.left.right.right = new Node(5);
				tree.root.left.right.left = new Node(9);
				tree.root.right = new Node(8);
				tree.root.right.right = new Node(13);
				tree.root.right.right.left = new Node(7);
				Node a = tree.lcaFind(root,tree.root.left.left,tree.root.left.right.right);
				System.out.print(a.data);
}

}