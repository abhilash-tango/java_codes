class Node{
	int data;
	Node left,right;
	Node(int d){
		data= d;
		left=right=null;
	}
}
class ceilValue{
	static Node root;
	ceilValue(){
		root = null;
	}
	int ceil(Node node,int k){
		if(node == null){
			return -1;
		}
		if(node.data == k){
			return k;
		}
		if(node.data<k){
			 return ceil(node.right,k);
		}
		
		int cell = 	ceil(node.left,k);
		return (cell>k?cell:node.data);
		
		
	}

	public static void main (String[] args) {
		ceilValue tree = new ceilValue();
		  tree.root = new Node(8);
        tree.root.left = new Node(4);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(10);
        tree.root.right.right = new Node(14);
        for (int i = 0; i < 16; i++) {
           System.out.println(i+" ceil value"+tree.ceil(root,i));
        }
}
}