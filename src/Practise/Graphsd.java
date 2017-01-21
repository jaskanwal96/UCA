package Practise;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graphsd {
	private LinkedList[] adj;
	private int V;
	private int E;
	private boolean marked[];
	private int count = 0;
	boolean RED = true;
	boolean BLUE = false;
	
	Graphsd(int v)
	{
		this.V = v;
		adj = new LinkedList[V];
		for(int i = 0; i < v; i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
		this.E = 0;
	}
	void addEdge(int v,int w){
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}
	void DFS(int s){
		marked = new boolean[V];
		DFSUtil(s);
	}
	private void DFSUtil(int s) {
		marked[s] = true;
		//System.out.println(s+" ");
		Iterator<Integer> it = adj[s].iterator();
		while(it.hasNext())
		{
			int n = it.next();
			if(!marked[n]){
				DFSUtil(n);
				
			}
			
		}
		
	}
	int numberoflands(){
		marked = new boolean[V];
		for(int i = 0; i < V; i++)
		{
			if(!marked[i])
			{
				DFSUtil(i);
				count++;
			}
			
		}
		
		return count;
	}
	boolean isCycle(){
		marked = new boolean[V];
		for(int i  = 0; i < V; i++)
		{
			if(!marked[i])
			{
				if(isCycleUtil(i,-1))
					return true;
			}
		}	
		return false;
	}
	private boolean isCycleUtil(int s,int parent) {
		marked[s] = true;
		Iterator<Integer> it = adj[s].iterator();
		while(it.hasNext())
		{
			int n = it.next();
			if(!marked[n]){
				if(isCycleUtil(n,s))
					return true;
				
			}
			else
				if(n != parent)
					return true;
			
		}
		
		
		return false;
	}
	private boolean isBipartite(){
		int s = 0;
		//marked = new boolean[V];
		boolean color[] =  new boolean[V];
		for(int i = 0; i < V; i++)
			color[i] = false;
		
		for(int i = 0; i < V; i++)
		{
			System.out.print(i+" ");
			if(!color[i])
			{
				if(!isBipUtil(i,color))
					return false;
			}
		}
		return true;
	}
	private boolean isBipUtil(int src, boolean[] color) {
		//marked[src] = true;
		color[src] = true;
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.push(src);
		
		while(!q.isEmpty())
		{
			int n = q.poll();
			Iterator<Integer> i = adj[src].iterator();
			while(i.hasNext())
			{
				int v = i.next();
				if(marked[v] && color[v] != color[n])
					{
						if(color[n]==false)color[n]  = true;
						else color[n] =true;
						q.add(v);
					}
				else
					if(marked[v] && color[v] == color[n])
					return false;
				
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Graphsd obj = new Graphsd(6);
		obj.addEdge(0, 3);
		obj.addEdge(0, 4);
		obj.addEdge(1, 3);
		obj.addEdge(1, 4);
		obj.addEdge(2, 4);
		obj.addEdge(2, 5);
		
		//obj.DFS(0);
	//	System.out.println(obj.numberoflands());
		System.out.println("Bipartite Detection: "+obj.isBipartite());
		
	}

	}


