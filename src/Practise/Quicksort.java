package Practise;
import java.util.Scanner;
public class Quicksort {
	 static void swap(int []a,int i,int j){
		int t = i;
		i = j;
		j = t;
	}
	 static int partition(int []a,int l,int r){
		int pivot = a[r];
		int pIndex = l;
		for(int i = l; i < r; i++){
			if(a[i] <= pivot){
				swap(a,a[i],a[pIndex]);
				pIndex++;
			}
			
		}
		swap(a,a[pIndex],a[r]);
		return pIndex;
	}
	 static void quickSort(int []a,int l,int r){
		if(l >= r) return;
		int pIndex = partition(a,l,r);
		partition(a,l,pIndex-1);
		partition(a,pIndex+1,r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		int []a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}
		quickSort(a,0,n-1);
		for(int i = 0; i < n; i++){
			System.out.println(a[i]);
		}
	}
	

}
