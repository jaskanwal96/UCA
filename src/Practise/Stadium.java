package Practise;

import java.util.Collections;
import java.util.PriorityQueue;
//Stadium contains rows with prices propotional to seats avaialable Find the maximum profit 

public class Stadium {
	public static void main(String[] args)
	{
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		q.add(1);
		q.add(3);
		q.add(4);
		int n = 7;
		int max = 0;
		while( n > 0)
		{
			int ma = q.remove();
			max += ma;
			q.add(--ma);
			n--; 
		}
		System.out.println(max);
	}
	
}
