
public class QuickSort extends mySort{
	@Override
	protected void sort(){
		quickSort(0,a.length-1);
	}
	private void quickSort(int lowerIndex, int higherIndex) {
        
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = a[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(a,i, j);
              
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
	public QuickSort(int[] a){
		super.a = a;
	}
	@Override
	protected void print(){
		System.out.println("Quick Sort:");
		super.print();

	}
}
