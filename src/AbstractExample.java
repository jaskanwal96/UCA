
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,3,1,2};
		int[] b = a.clone();
		mySort s  = new SelSort(a);
		s.sort();
		s.print();
		
		s = new QuickSort(b);
		s.sort();
		s.print();
	}

	
	
}

