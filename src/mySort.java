
public abstract class mySort {
	protected int[] a;
	protected void swap(int[] a,int i,int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	protected void print(){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	protected abstract void sort();
}

