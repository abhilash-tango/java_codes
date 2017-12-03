class Node{
	int key;
	Node left,right;
	Node(int d){
		key = d;
		left=right =null;
	}
	
}
	class Binary{
	 static	Node root;
		Binary(){
			root = null;
		}
		void Preorder(Node node){
			if(node == null){
				return ;
			}
			System.out.print(node.key+" ");
			Preorder(node.left);
			Preorder(node.right);
		}
		void inorder(Node node){
			if(node == null){
				return;
				
			}
			inorder(node.left);
			System.out.print(node.key+" ");
			inorder(node.right);
		}
		void postorder(Node node){
			if(node == null){
				return;
			}
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.key+" ");
		}
	public static void main (String[] args) {
		Binary tree = new Binary();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Preorder traversal of binary tree is ");
        tree.Preorder(root);
        
        System.out.println("\nInorder traversal of binary tree is ");
        tree.inorder(root);
           System.out.println("\nPostorder traversal of binary tree is ");
        tree.postorder(root);
}
	}