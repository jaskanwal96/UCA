import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private int V;
    private LinkedList<Integer> []adj;
    Solution(int V){
        this.V = V;
        adj = new LinkedList[this.V];
        for(int i = 0; i < V; i++)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w){
        adj[v].add(w);
        //adj[w].add(v);
    }
    void topologicalSortUtil(int v, boolean[] visited, Stack stk){
        visited[v] = true;
        Iterator<Integer> it = adj[v].iterator();
        while(it.hasNext()){
            int n = it.next();
            if(!visited[n])topologicalSortUtil(n, visited, stk);
        }
        stk.push(v);
    }
    void topologicalSort(){
        Stack stk = new Stack();
        boolean []visited = new boolean[V];
        for(int i = 0; i < V; i++)visited[i] = false;
        for(int i = 0; i < V; i++)
            if(!visited[i])
            topologicalSortUtil(i, visited, stk);
        
        while(!stk.isEmpty())
        System.out.print(stk.pop()+" ");
    }
    public static void main(String[] args) {
        Solution g = new Solution(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        //for(int i = 0; i < 6; i++)
        //System.out.println(g.adj[i]);
        g.topologicalSort();
    }
}
