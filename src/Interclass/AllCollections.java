//Collection interface


package Interclass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AllCollections implements Comparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l =  new LinkedList<Integer>(); 
		l.add(10);
		l.add(3);
		l.add(1);
		l.add(4);
		l.add(2);
		l.add(6);
		l.add(9);
		l.add(0);
		
		Collections.sort(l);
		Iterator<Integer> it0 = l.iterator();
		System.out.print("Linked List Implementation of Queue ");
		while(it0.hasNext()){
			int n = it0.next();
			System.out.print(n+" ");
		}
		Queue<Integer> qL= new LinkedList<Integer>();
		qL.add(10);
		qL.add(3);
		qL.add(1);
		qL.add(4);
		qL.add(2);
		qL.add(6);
		qL.add(9);
		qL.add(0);
		
		System.out.println();
		Queue<Integer> qPQ= new PriorityQueue<Integer>();
		qPQ.add(10);
		qPQ.add(3);
		qPQ.add(1);
		qPQ.add(4);
		qPQ.add(2);
		qPQ.add(6);
		qPQ.add(9);
		qPQ.add(0);
		System.out.print("Priority Queue Implementation of Queue ");
		
		Iterator<Integer> it2 = qPQ.iterator();
		while(it2.hasNext()){
			int n = it2.next();
			System.out.print(n+" ");
		}
		System.out.println();
		
		
		System.out.println();
		Set<Integer> setH = new HashSet<Integer>();
		setH.add(10);
		setH.add(3);
		setH.add(1);
		setH.add(4);
		setH.add(2);
		setH.add(6);
		setH.add(9);
		setH.add(0);
		Iterator<Integer> it3 = setH.iterator();
		System.out.print("HashSet Implementation of Set: ");
		while(it3.hasNext()){
			int n = it3.next();
			System.out.print(n+" ");
		}

		System.out.println();
		
		Set<Integer> setT = new TreeSet<Integer>();
		setT.add(10);
		setT.add(3);
		setT.add(1);
		setT.add(4);
		setT.add(2);
		setT.add(6);
		setT.add(9);
		setT.add(0);
		Iterator<Integer> it4 = setT.iterator();
		System.out.print("TReeSet Implementation of Set: ");
		while(it4.hasNext()){
			int n = it4.next();
			System.out.print(n+" ");
		}
		Map<Integer, String> mpH = new HashMap<Integer, String>();
		Map<Integer, String> mpT = new TreeMap<Integer, String>();
		
		
		
		
		
	}

	@Override
	public int compareTo(Object arg0) {
		
		return 1;
	}

}
