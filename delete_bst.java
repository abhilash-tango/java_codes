class Node{
	int key;
	Node left,right;
	Node(int d){
		key =d;
		left=right=null;
	}
}
class deletebst{
	Node root;
	deletebst(){
		root = null;
	}
	Node deleteB(Node node,int value){
		if(node == null){
			return node;
		}
		if(value<node.key){
			node.left = deleteB(node.left,value);
		}
	 else if(value>node.key){
			node.right = deleteB(node.right,value);
		}
		else{
			if(node.right == null){
				return node.left;
			}
			else if(node.left == null){
				return node.right;
			}
			else if(node.right == null && node.left == null){
				return null;
			}
			else{
				node.key = findMin(node.right);
				node.right = deleteB(node.right,node.key);
				
			}
			}return node;
		}
		int findMin(Node node){
			int x=Integer.MIN_VALUE;
			while(node.left != null){
				x=node.key;
				node=node.left;
				
			}
			return x;
		}
		void insert(int l){
			root=inserrec(root,l);
		}
		Node inserrec(Node node,int k){
			
			if(node == null){
				node = new Node(k);return node;
			}
			if(k<=node.key){
				node.left = inserrec(node.left,k);
			}
			if(k>node.key){
				node.right=inserrec(node.right,k);
			}return node;
			}
			void printinorder(Node node){
				if(node != null){
				
				printinorder(node.left);
				System.out.print(node.key+" ");
				printinorder(node.right);}
			}
			void delete(int k){
				root=deleteB(root,k);
			}
			void printinorderr(){
				printinorder(root);
			}
			public static void main (String[] args) {
				deletebst tree = new deletebst();
				 tree.insert(50);
		        tree.insert(30);
		        tree.insert(20);
		        tree.insert(40);
		        tree.insert(70);
		        tree.insert(60);
		        tree.insert(80);
		        
        System.out.println("Inorder traversal of the given tree");
        tree.printinorderr();
        
        System.out.println("\nDelete 20");
        tree.delete(60);
        System.out.println("Inorder traversal of the modified tree");
        tree.printinorderr();
 
}
		}
		
	
