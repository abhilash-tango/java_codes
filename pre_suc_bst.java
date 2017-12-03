class Node{
	int key;
	Node left,right;
	Node(int d){
		key = d;
		left=right=null;
	}
}
class precessor{
	Node root;
	precessor(){
		root = null;
	}Node pre=null,succ=null;
	void predd(int k){
		Pred(root,null,null,k);
		System.out.print("Precessor "+this.pre.key+"Succesor "+this.succ.key);
	}
	void Pred(Node root,Node pre,Node succ,int k){
		if(root == null){
			return;
		}
		if(root.key == k){
			if(root.left != null){
				Node temo=root.left;
				while((temo.right!=null)){
					temo=temo.right;
				}this.pre = temo;
			}
			if(root.right != null){
				Node pemo = root.right;
				while(pemo.left!=null){
					pemo=pemo.left;
					
				}this.succ=pemo;
			}return;
		}
		if(root.key > k){
			this.succ=root;
			Pred(root.left,this.pre,this.succ,k);}
		else{
			this.pre = root;
			Pred(root.right,this.pre,this.succ,k);
		}	
		}
		void insert(int k){
			root = insertrec(root,k);
		}
		Node insertrec(Node node,int k){
			if (node == null){
				node = new Node(k);
				return node;
			}
			if(k<node.key){
			node.left=	insertrec(node.left,k);
			}
			if(k>node.key){
				node.right=insertrec(node.right,k);
			}return node;
		}
		void printinorder(Node node){
			if(node!=null){
				printinorder(node.left);
				System.out.print(node.key+" ");
				printinorder(node.right);
			}
		}
		void inorder(){
			printinorder(root);
		}
	
	public static void main (String[] args) {
		precessor tree = new precessor();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insert(35);
		tree.inorder();
		tree.predd(40);
}
	
}