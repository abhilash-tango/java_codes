class Node{
	int key;
	Node left,right;
	Node(int d){
		key = d;
		left=right=null;
	}
}
class kthsmallest{
	Node root ;
	kthsmallest(){
		root=null;
	}
	void printkthsmall(Node node,int k ,int p){
		if(node!=null){
		 printkthsmall(node.left,k,p);
	     ++p;
		if(p==k){
			System.out.print(node.key);
		}
		 printkthsmall(node.right,k,p);
	}}
	
	void kthsmall(int k){
		printkthsmall(root,k,0);
	}
	void insert(int k){
		root=insertrec(root,k);
	}
	Node insertrec(Node node,int k){
		if(node == null){
			node =new Node(k);
			return node;
		};
		if(node.key>k){
			node.left=insertrec(node.left,k);
			
		}
		if(node.key<k){
			node.right=insertrec(node.right,k);
		}return node;
	}
	public static void main (String[] args) {
		kthsmallest tree = new kthsmallest();
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(99);
		tree.insert(68);
		tree.insert(12);
		tree.kthsmall(5);
		
		
}
}