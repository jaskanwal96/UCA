package Practise2;

import java.util.Iterator;
import java.util.LinkedList;

public class Digraph {
	public LinkedList<Integer>[] adj;
	private int V;
	private int E;
	private boolean []marked;
	private int []edgeTo;
	public Digraph(int V)
	{
		this.V = V;
		this.adj = new LinkedList[V+1];
		for(int i = 1; i <= V; i++)
			this.adj[i] = new LinkedList<Integer>();
		this.E = 0;
		
	}
	int V(){
		return V;
	}
	int E(){
		return E;
	}
	LinkedList<Integer>[] adj(){
		return adj;
	}
	void addEdge(int v,int w){
		adj[v].add(w);
		E++;
	}
	void printGraph(){
		for(int i = 0; i < adj.length; i++)
			System.out.println(adj[i]);
	}
	void DFS(int s){
		marked = new boolean[V()];
		DFSUtil(s);
	}
	void DFSUtil(int s){
		marked[s] = true;
		System.out.print(s+" ");
		Iterator<Integer> i = adj[s].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(!marked[n])
				DFSUtil(n);
				
		}
	}
	
	void BFS(int s)
    {
        
        marked = new boolean[V];
       // edgeTo = new int[V];
		for(int i = 1; i <= V; i++)
			this.edgeTo[i] = Integer.MAX_VALUE;
		
        LinkedList<Integer> queue = new LinkedList<Integer>();
        marked[s]=true;
        queue.add(s);
        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!marked[n])
                {
                    marked[n] = true;
                    queue.add(n);
                   // edgeTo[n] = s;
                }
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digraph obj = new Digraph(13);
		obj.addEdge(0, 1);
		obj.addEdge(0, 5);
		obj.addEdge(2, 3);
		obj.addEdge(2, 0);
		obj.addEdge(3, 2);
		obj.addEdge(3, 5);
		obj.addEdge(4, 2);
		obj.addEdge(5, 4);
		obj.addEdge(6, 0);
		obj.addEdge(6, 4);
		obj.addEdge(6, 8);
		obj.addEdge(6, 9);
		obj.addEdge(7, 6);
		obj.addEdge(7, 9);
		obj.addEdge(8, 6);
		obj.addEdge(9, 11);
		obj.addEdge(9, 10);
		obj.addEdge(10, 12);
		obj.addEdge(11, 4);
		obj.addEdge(11, 12);
		obj.addEdge(12, 9);
		
		obj.DFS(2);
		System.out.println();
		obj.BFS(2);
		System.out.println();
		
		for(int i = 0; i < obj.V(); i++)
			System.out.print(obj.edgeTo[i]+" ");
		
		System.out.println();
		//obj.printGraph();
		
	}

}
