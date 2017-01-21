package Practise;

import java.util.PriorityQueue;

public class minPQ {
static int[] arr  = new int[1000];
static int index = 0;
static int n = 0;
public void Insert(int value)
{
	n++;
	arr[++index] = value;
	swim(index);
}
public void Retrieve()
{
	swap(1,index);
	System.out.print(arr[index]+" ");
	index--;
	sink(1);
	
	
}
public void swap(int a,int b){
	int temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
}
public void swim(int index){
	if(index <= 1)
	{
		return;
	}
	if(arr[index] < arr[index/2])
	{
		swap(index,index/2);
	}
	swim(index/2);
}

public void sink(int i)
{
    int largest = i;  // Initialize largest as root
    int l = 2*i + 1;  // left = 2*i + 1
    int r = 2*i + 2;  // right = 2*i + 2

    // If left child is larger than root
    if (l < n && arr[l] < arr[largest])
        largest = l;

    // If right child is larger than largest so far
    if (r < n && arr[r] < arr[largest])
        largest = r;

    // If largest is not root
    if (largest != i)
    {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;

        // Recursively heapify the affected sub-tree
        sink( largest);
    }
}
public static void main(String[] args){
	minPQ obj = new minPQ();
	obj.Insert(7);
	obj.Insert(6);
	obj.Insert(4);
	obj.Insert(5);
	obj.Insert(3);
	obj.Insert(8);
	//System.out.print(index);
	while(index > 1)
		obj.Retrieve();
	
		System.out.print(index+" ");
}

}
