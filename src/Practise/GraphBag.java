package Practise;

import java.util.LinkedList;

public class GraphBag {
	
	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	public GraphBag(int V)
	{
		this.V = V;
		this.adj = new LinkedList[V];
		for(int i = 0; i < V; i++)
			this.adj[i] = new LinkedList<Integer>();
		this.E = 0;
	}
	public int getV()
	{
		return this.V;
	}
	public int getE()
	{
		return this.E;
	}
	public void addEdge(int v,int w)
	{
		this.adj[v].add(w);
		this.adj[w].add(v);
		this.E++;
	}
	public Iterable<Integer> getAdj(int v)
	{
		return this.adj[v];
	}
	public boolean DFS(int v,int p){
		
		
		return false;
		
	}
	public static void main(String[] args)
	{
		GraphBag obj = new GraphBag(7);
		obj.addEdge(0, 1);
		obj.addEdge(0, 2);
		obj.addEdge(2, 3);
		obj.addEdge(2, 4);
		obj.addEdge(3, 4);
		//obj.addEdge(3, 5);
		obj.addEdge(5, 6);
		obj.DFS(0,-1);
	//	sysou
	}
}

