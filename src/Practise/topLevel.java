package Practise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class topLevel{
	//static Node root;

public class Node{
	public int key;
	public Node right;
	public Node left;
	public Node(int key){
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
	public static Node root;
	//static int count = 0;
	//*********************INSERT***************************
	public Node Insert(int key){
		root = Insert(root,key);
		return root;
	}
	private Node Insert(Node n, int key){
		if(n == null) return new Node(key);
		//if(n.key == key){}
		else if(key < n.key){
			n.left = Insert(n.left,key);
		}
		else{
			n.right = Insert(n.right,key);
		}
			
		return n;
	}
	int a;
public static void main(String[] args){
topLevel b = new topLevel();
	/* obj.Insert(9);
	obj.Insert(8);
	obj.Insert(2);
	obj.Insert(1);
	obj.Insert(3);
	obj.Insert(4);
	obj.Insert(5);
	obj.Insert(6);
	obj.Insert(7);
	obj.Insert(11);
	obj.Insert(10);
	*/
	b.Insert(6);
	b.Insert(4);
	b.Insert(3);
	b.Insert(5);
	b.Insert(10);
	b.Insert(9);
	b.Insert(11);
	b.Insert(1);
	b.Insert(13);
	getTheTop(root);
	zigZagTraversal(root);
	
}
private static void zigZagTraversal(Node root) {
	Stack<Node> first = new Stack<Node>();
	Stack<Node> second = new Stack<Node>();
	first.push(root);
	
	while(!first.isEmpty() || !second.isEmpty()){
		while(!first.isEmpty())
		{
			Node temp = first.peek();
			first.pop();
			System.out.print(temp.key+" ");
			if(temp.left!=null)second.push(temp.left);
			if(temp.right!=null)second.push(temp.right);
			
		}
		while(!second.isEmpty())
		{
			Node temp = second.peek();
			second.pop();
			System.out.print(temp.key+" ");
			if(temp.right!=null)first.push(temp.right);
			if(temp.left!=null)first.push(temp.left);
			
		}
	}
}
private static  void getTheTop(Node root) {
	
	}
}
