package Practise;

public class Graphs {
	static int V,E;
	static int arr[][];
	Graphs(int n)
	{
		V = n;
		arr = new int[V][V];
	}
	private void addEdge(int c1,int c2)
	{
		arr[c1][c2] = 1;
		arr[c2][c1] = 1;
	}
	public static void main(String[] args){
		Graphs obj = new Graphs(7);
		obj.addEdge(0, 1);
		obj.addEdge(0, 2);
		obj.addEdge(2, 3);
		obj.addEdge(2, 4);
		obj.addEdge(3, 4);
		obj.addEdge(3, 5);
		obj.addEdge(5, 6);
		for(int i = 0; i < V; i++)
		{
			for(int j = 0; j < V; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
