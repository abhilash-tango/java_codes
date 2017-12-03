import java.util.*;
class merge{

int[] mergeSort(int[] q,int n){
		if(n<2) return q;
		int mid= n/2;
		int[] l=new int [mid];
		int[] r = new int[n-mid];
		for(int i=0;i<mid;i++){
			l[i]=q[i];
		}
		for(int j=mid;j<q.length;j++){
			r[j]=q[j];
		}
		mergeSort(l,mid);
		mergeSort(r,n-mid);
		mergeit(q,n,l,mid,r,n-mid);return q;
	}
	void mergeit(int[] q,int n,int[] l,int mid,int[] r,int rest){
		int i=0,j=0,k=0;
	
	while(j<l.length && i<r.length){
			if(l[j]<r[i]){
			q[k]=l[j];
			j++;k++;
		}
		if(r[i]<l[j]){
			q[k]=r[i];
			i++;k++;
		}
	}
	while(j<l.length){
		q[k]=l[j];j++;k++;
	}
	while(i<r.length){
		q[k]=r[i];i++;k++;
	}
	}
	public static void main (String[] args) {
		int[] a={45,23,11,89,77,98,4,28,65,43};
		 merge ab = new merge();
		int[] c= ab.mergeSort(a,a.length);
		 for(int i=0;i<c.length;i++){
		 	System.out.print(c[i]+" ");
		 }
		
		
	    
}

}