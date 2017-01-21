package Practise;

public class Trie {
private class TrieNode{
	Integer value;
	TrieNode[] nodes = new TrieNode[26];
}
	TrieNode root;
	public Trie(){
		root = new TrieNode();
	}
	
	//**************************SEarch in Trie********************************
	private Integer Search(String w)
	{
		TrieNode p = SearchNode(w);
		if(p==null)return null;
		return p.value;
	}
	private TrieNode SearchNode(String w)
	{
		TrieNode p = root;
		for(int i = 0; i < w.length(); i++)
		{
			int index = w.charAt(i)-'a';
			if(p.nodes[index]==null)
				return null;
			p = p.nodes[index];
		}
		return p;
	}
	//********************Insert in Trie *******************************
	private TrieNode InsertNode(String w,Integer v)
	{
		TrieNode p = root;
		for(int i = 0; i < w.length(); i++)
		{
			int index = w.charAt(i)- 'a';
			if(p.nodes[index] == null)
				p.nodes[index] = new TrieNode();
			
			p = p.nodes[index];
		}
		p.value = v;
		return p;
	}
	private int StartsWith(String w)
	{
		//w.com
		TrieNode p = SearchNode(w);
		int count = 0;
		for(int i = 0; i < 26; i++)
		{
			if(p.nodes[i]!=null)
				count++;
		}
				return count;
	}
	public static void main(String[] args){
		Trie obj = new Trie();
		obj.InsertNode("ann", 20);
		obj.InsertNode("amy", 20);
		obj.InsertNode("amway", 90);
		obj.InsertNode("rob", 50);
		obj.InsertNode("robb", 100);
		obj.InsertNode("robe", 50);
		
		obj.InsertNode("emma", 5);
		System.out.println(obj.Search("robb"));
		System.out.println(obj.StartsWith("ro"));
	}
}
