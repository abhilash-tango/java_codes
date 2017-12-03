import java.util.*;
class subarray{
	public static void main (String[] args) {
			ArrayDeque<Integer> ab = new ArrayDeque<Integer>();
			int[] arr = {12, 1, 78, 90, 57, 89, 56};
			int k =3 ;
			int i;
			for( i=0;i<k;++i){
				while(!ab.isEmpty() && arr[i] >= arr[ab.getLast()]){
					ab.removeLast();
				}
			ab.addLast(i);
			}
			for(;i<arr.length;++i){
				System.out.print(arr[ab.getFirst()]+" ");
				while(!ab.isEmpty() && i-k >= ab.getFirst()){
					ab.removeFirst();
				}
				while(!ab.isEmpty() && arr[i] >= arr[ab.getLast()]){
					ab.removeLast();
				}
				ab.addLast(i);
			}
			System.out.print(arr[ab.getFirst()]);
		
}
}