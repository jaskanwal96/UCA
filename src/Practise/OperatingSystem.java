package Practise;

import java.util.Comparator;
//import Practise.BinarySearchTree.Node;

class Process{
	private String pName;
	private int pId;
	Process(String pName, int pId){
		this.pName = pName;
		this.pId = pId;
	}
	public String getpName() {
		return this.pName;
	}
	public int getpId() {
		return this.pId;
	}
	
}
 class Priority{
	int avgTime;
	int medianTime;
	Priority(int aT,int mT)
	{
		avgTime = aT;
		medianTime = mT;
	}
	public int getavgTime(){
		return this.avgTime;
	}
	public int getmedianTime(){
		return this.medianTime;
	}
}
 class byAvgTime implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Priority p1 = (Priority)o1;
			Priority p2 = (Priority)o2;
			if(p1.getavgTime() > p2.getavgTime()) return 1;
			if(p1.getavgTime() < p2.getavgTime()) return -1;
			
			return 0;
		}
		
	}
	
 class byMedianTime implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Priority p1 = (Priority)o1;
			Priority p2 = (Priority)o2;
			if(p1.getmedianTime() > p2.getmedianTime()) return 1;
			if(p1.getmedianTime() < p2.getmedianTime()) return -1;
			
			return 0;
		}
		
	}
 //je aapa dove rus gye taa mnauu kon ve haayee manaau kon ve
 //kawan ve kawan veh udh ja ve kawan
 //
	
public class OperatingSystem {
	Node root;
	 class Node{
		 Process p;
		 Priority Pr;
		 Node right;
		 Node left;
		 Node(Process p,Priority pr){
			this.p = p;
			this.Pr = pr;
			this.left = null;
			this.right = null;
		}
	}
	
	public void inorder(){
		inorder(root);
	}
	public void inorder(Node root){
		if(root == null)return;
		if(root.left!=null)
		inorder(root.left);
		System.out.println(root.p.getpName());
		if(root.right!=null)
		inorder(root.right);
	}
	public void Insert(Process p,Priority pr,Comparator c)
	{
		root = Insert(root,p,pr,c);
	}

	public Node Insert(Node root,Process p,Priority pr,Comparator c)
	{
		if(root == null) return new Node(p,pr);
		if(c.compare(root.Pr,pr) > 0)root.left = Insert(root.left,p,pr,c);
		if(c.compare(root.Pr,pr) < 0)root.right = Insert(root.right,p,pr,c);
		
		return root;
	}
	
	public static void main(String[] args)
	{
		Process p1 = new Process("Process 1",1);
		Process p2 = new Process("Process 2",2);
		Process p3 = new Process("Process 3",3);
		
		Priority pr1 = new Priority(5,6);
		Priority pr2 = new Priority(3,1);
		Priority pr3 = new Priority(4,7);
		
		OperatingSystem obj = new OperatingSystem();
		//Comparable cc =
		Comparator c = new byMedianTime();
		obj.Insert(p1, pr1, c);
		obj.Insert(p2, pr2, c);
		obj.Insert(p3, pr3, c);
		obj.inorder();
		
	}
}
