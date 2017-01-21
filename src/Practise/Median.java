package Practise;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Median {
	public static double getMedians(int[] arr)
	{
		PriorityQueue<Integer> lowers = new PriorityQueue<Integer>( new Comparator<Integer>(){
			public int compare(Integer a,Integer b){
				return -1 * a.compareTo(b);
			}
			
		});
		
		PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
		double medians;
		for(int i = 0; i < arr.length; i++)
		{
			int number = arr[i];
			addNumber(number, lowers, highers);
			rebalance(lowers,highers);
		}
		return getMedian(lowers,highers);
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
		double median = getMedians(a);
		System.out.println(median);
	}
}
