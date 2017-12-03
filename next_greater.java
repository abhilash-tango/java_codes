/*Given an array, print the Next Greater Element (NGE) for every element. 
 *The Next greater Element for an element x is the first greater element on the right
 * side of x in array. Elements for which no greater element exist, consider next greater element as -1.
*/

class next{
	public static void main (String[] args) {
		int[] a = {13,7,6,12};
		int[] b = new int[a.length];
		int count;
			for (int i=0;i<a.length;i++){
				count =0 ;
				for(int j=i+1;j<a.length;j++){
					if(a[j]>a[i]){
						b[i]=a[j];
						count++;
						break;
					}
				
				}
					if(count == 0)
						b[i]=-1;
				
				
			}
	for(int k=0;k<a.length;k++){
		System.out.println(a[k]+"next"+b[k]);
	}
}
}