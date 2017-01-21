package Practise2;

import java.util.LinkedList;

public class Graph {
	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	Graph(int V){
		this.V = V;
		E = 0;
		adj = new LinkedList[V];
		for(int i = 0; i < V; i++)
			adj[i] = new LinkedList();
		
	}
}

