package Practise;
/*
 Insertion - adding element at the end and compare it with it root and swim it up if necessary
 delMax = 
 */
 
public class HeapSort {
	static int[] arr = new int[1000];
	
	static int n = 0;
	public void Insert(int value)
	{
		arr[++n] = value;
		swim(n);
	}
	public void swim(int index){
		if(index<=1)
			return;
		if(arr[index] < arr[index/2])
		{
			swap(index,index/2);
			swim(index/2);
		}
	}
	public void Retrieve()
	{
		swap(1,n);
		System.out.print(arr[n--]+" ");
		
		sink(1);
		
		
	}
//	public void sink(int k){
//		int small = k;
//		int l = 2*k;
//		int r = 2*k + 1;
//		if(l <= n && arr[l] <= arr[k]){
//			small = l;
//		}
//		
//		if(r <= n && arr[r] < arr[k]){
//			
//			small = r;
//		}
//		
//			
//		if(small!=k)
//		{
//			swap(small,k);
//			sink(small);
//		}
//	}
	public boolean ifGreat(int i,int j ){
		if(arr[i]>arr[j])return true;
		
		return false;
	}
	private void sink(int k) {
		  
		if (2*k <= n) {
		      int j = 2*k;
		      if (j < n && ifGreat(j, j+1)) j++;
		      if (!ifGreat(k, j)) return;
		      swap(k, j);
		      sink(j);
		   }
		}
	void swap(int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort obj = new HeapSort();
		obj.Insert(7);
		obj.Insert(6);
		obj.Insert(4);
		obj.Insert(5);
		obj.Insert(3);
		obj.Insert(8);
//	for(int i = 0; i < n; i++)
//		System.out.println(arr[i]+" ");
		while(n>=1)
			obj.Retrieve();
	}

}
