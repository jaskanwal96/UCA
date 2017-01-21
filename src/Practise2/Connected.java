package Practise2;

import java.util.Iterator;
import java.util.Stack;

//Strongly connected Kosaraju- Sharir algorithm
//Topological sort + check  all codes
public class Connected {
	Digraph Reverse(Digraph a){
		
	return a;
	}
	void topological(Digraph a, int v, boolean vi[], Stack<Integer> s)
	{
		vi[v] = true;
		Iterator<Integer> it =  a.adj[v].listIterator();
		while(it.hasNext()){
			int n = it.next();
			if(!vi[n])
				topological(a,n,vi,s);
		}
		s.push(v);
	}
	Stack<Integer> Topological(Digraph a){
	boolean[] vi = new boolean[a.V()+1];
	Stack<Integer> stk = new Stack<Integer>();
	
	for(int i = 1; i <= a.V(); i++){
		if(!vi[i])topological(a,i,vi,stk);
	}
	while(!stk.isEmpty()){
		System.out.print(stk.pop()+" ");
	}
	return stk;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digraph a = new Digraph(6);
		Connected obj = new Connected();
		a.addEdge(1, 3);
		a.addEdge(3, 2);
		a.addEdge(2, 1);
		a.addEdge(3, 4);
		a.addEdge(4, 5);
		a.addEdge(5, 6);
		a.addEdge(6, 4);
		obj.Topological(obj.Reverse(a));
		
	}

}
