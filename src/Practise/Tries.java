package Practise;


public class Tries  {
	private class TrieNode{
		Integer value;
		TrieNode []nodes = new TrieNode[26];
		Integer usage = 0;
		
	}
	TrieNode root;
	public Tries(){
		root = new TrieNode();
	}
	private TrieNode Insert(String a,Integer value)
	{
		TrieNode temp = root;
		for(int i = 0; i < a.length(); i++){
			int index = a.charAt(i)- 'a';
			if(temp.nodes[index] == null)
			temp.nodes[index] = new TrieNode();
			temp = temp.nodes[index];
			temp.nodes[index].usage++;
		}
		temp.value = value;
		return temp;
	}
	public Integer SearchIt(String w){
		TrieNode temp = Search(w);
		if(temp == null) return null;
		return temp.value;
	}
	private TrieNode Search(String w)
	{
		TrieNode temp = root;
		for(int i = 0; i < w.length(); i++)
		{
			int index = w.charAt(i) - 'a';
			if(temp.nodes[index] == null)
				return null;
			else
				temp = temp.nodes[index];
		}
		return temp;
	}
	
	private Integer Start(String w)
	{
		TrieNode temp = Search(w);
		return temp.usage;
	}
	public static void main(String []args)
	{
		Tries obj = new Tries();
		obj.Insert("ann", 20);
		obj.Insert("amy", 30);
		obj.Insert("amway", 90);
		obj.Insert("rob", 50);
		obj.Insert("robb", 100);
		obj.Insert("robe", 60);
		int a = obj.Start("am");
		System.out.println(a);
	}
	

}
