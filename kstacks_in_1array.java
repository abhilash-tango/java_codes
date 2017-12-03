class kstacks{
	int[] next;
	int[] arr;
	int[] top;
	int k,n,free;
	public kstacks(int k,int n){
		this.k=k;
		this.n=n;
		next = new int[n];
		arr = new int[n];
		top = new int[k];
		free = 0;
		for(int i=0;i<n-1;i++){
			next[i]=i+1;
			
		}
		for(int j=0;j<k;j++){
			top[j]=-1;
		}
		
		
	}
	void push(int data, int sn){
		int m = free;//knows the free index of array
		free=next[m];//assigns next free index
		next[m]=top[sn];//assign the index of next element 
		top[sn]=m;//update index of top of sn stack
		arr[m]=data;//putts data in the array
	}
	public int pop(int sn){
		int m = top[sn];
		top[sn]= next[m];
		next[m]= free;
		free = m;
		return arr[m];
		
	}
	public static void main (String[] args) {
		kstacks ks = new kstacks(3,10);
		// Let us put some items in stack number 2
    ks.push(15, 2);
    ks.push(45, 2);
 
    // Let us put some items in stack number 1
    ks.push(17, 1);
   
    ks.push(39, 1);
 
    // Let us put some items in stack number 0
    ks.push(11, 0);
    ks.push(49, 1); ks.push(9, 0);
    ks.push(7, 0);
 
    System.out.println("Popped element from stack 2 is "+ks.pop(2));
    System.out.println("Popped element from stack 1 is "+ks.pop(1));
    System.out.println("Popped element from stack 0 is "+ks.pop(0));
}
}