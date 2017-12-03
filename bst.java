class Node{
	 int key;
	Node left,right;
	Node(int d){
		key=d;
		left=right=null;
		
	}
}
class binarysearch{
 Node root;
	binarysearch(){
		root =null;
	}
	void insert(int key){
		root = insertrec(root,key);
	}
	Node insertrec(Node node,int key){
		if(node == null){
			node=new Node(key);
			return node;
		}
		if(key<node.key){
				node.left=insertrec(node.left,key);
		
		}
		else if(key>node.key){
				node.right=insertrec(node.right,key);
		
		}
		return node;
	}
	void inorder(Node node){
		if(node == null){
			return;
		}
		inorder(node.left);
		System.out.println(node.key);
		inorder(node.right);
		
	}
	void inorder(){
		inorder(root);
	}
	public Node search(Node node, int key)
{
	// Base Cases: root is null or key is present at root
	if (node==null || node.key==key){
	
		return node;}
		

	// val is greater than root's key
	if(node.key > key)
		return search(node.left, key);

	// val is less than root's key
	return search(node.right, key);
}
 Node search(){
 	return search(root,400);
 	
	
}

	public static void main (String[] args) {
		binarysearch tree = new binarysearch();
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
       Node ab= tree.search();
       if(ab != null){
       	System.out.print("Found");
       }else{
       	System.out.print("Not found");
       }
        
}
	
}