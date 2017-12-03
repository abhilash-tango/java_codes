class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;	}
}
class correct{
	static Node root;
	Node prev=null,first=null,second=null;
	correct(){
		root = null;
	}
	
	void printinorder(Node node){
		if(node != null){
			printinorder(node.left);
			System.out.print(node.data+" ");
			printinorder(node.right);
		}
	}
	void correctinorder(Node node){
		if(node!=null){
			correctinorder(node.left);
			if(prev!=null){
			
			if(node.data<prev.data){
				if(first == null){
					first = prev;
					
				}second=node;
			}
		}prev=node;correctinorder(node.right);
		}
	}
	void correctbst(Node node){
		correctinorder(node);
		int temp;
		temp= first.data;
		first.data =second.data;
		second.data = temp;
		System.out.println();
		
	}
	public static void main (String[] args) {
		correct tree = new correct();
		tree.root = new Node(6);
		tree.root.left = new Node(10);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.right.right = new Node(12);
		tree.root.right.left = new Node(7);
		tree.printinorder(root);
		tree.correctbst(root);
		tree.printinorder(root);
		 
}
}