package Practise;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Comparator;
public class RunningMedian
{
	public static double[] getMedians(int[] arr)
	{
		PriorityQueue<Integer> lowers = new PriorityQueue<Integer>( new Comparator<Integer>(){
			public int compare(Integer a,Integer b){
				return -1 * a.compareTo(b);
			}
			
			
		});
		
		PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
		double[] medians = new double[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			int number = arr[i];
			addNumber(number, lowers, highers);
			rebalance(lowers,highers);
			medians[i] = getMedian(lowers,highers);
		}
		return medians;
	}
	private static double getMedian(PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> smallerHeap = lowers.size()<highers.size()?lowers:highers;
		PriorityQueue<Integer> biggerHeap = lowers.size()>highers.size()?lowers:highers;
		if(biggerHeap.size() == smallerHeap.size())
		{
			return ((double)smallerHeap.peek()+biggerHeap.peek())/2;
		}
		else
		{
			return biggerHeap.peek();
		}
		
	}
	private static void rebalance(PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> smallerHeap = lowers.size()<highers.size()?lowers:highers;
		PriorityQueue<Integer> biggerHeap = lowers.size()>highers.size()?lowers:highers;
		
		if(biggerHeap.size() - smallerHeap.size() >=2)
		{
			smallerHeap.add(biggerHeap.peek());
		}
		
	}
	private static void addNumber(int number, PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers) {
		if(lowers.size() == 0 || number < lowers.peek()){
			lowers.add(number);
			
		}
		else{
			highers.add(number);
		}
		
	}
	public static void main(String[] args)
	{
		int[] a = {7,6,4,3,1,2,9};
		double[]medians = new double[a.length];
		for(int i = 0; i < a.length; i++)
		{
			medians = getMedians(a);
			for(int j = 0; j < medians.length; j++)
				System.out.print(medians[j]+" ");
			System.out.println();
		}
//		for(int i = 0; i < medians.length; i++)
//		System.out.println(medians[i]+" ");
	}
}
