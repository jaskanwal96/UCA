package Practise;

import java.util.*;
import java.lang.String;
class Node{
	String key;
	int count = 0;
	Node right;
	Node left;
	public Node(String key){
		this.key = key;
		this.left = null;
		this.right = null;
		count = 0 ;
	}
}

public class Solution{
    	static Node root,temp;
    	static int max = 0;
	//*********************INSERT***************************
	public void Insert(String key){
		root = Insert(root,key);
		
	}
	private Node Insert(Node n, String key){
	 
		if(n == null) return new Node(key);
		if(n.key.equals(key)){
		    n.count++;
	        
		}
	
		else if(key.compareTo(n.key)<0){
			n.left = Insert(n.left,key);
		}
		else{
			n.right = Insert(n.right,key);
		}
        
		return n;
	}
	public void printPostorder(Node node)
    {
        if (node == null)
            return;
    printPostorder(node.left);
    printPostorder(node.right);
    if(node.count > max){
        max = node.count;
        temp = node;
    }
    }
	public static void main(String[] args){
		
		// Read input from stdin and provide input before running if required
		Solution b = new Solution();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int minL = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
		String thisStr[] = str.split(" "); 
			for(int j = 0; j < thisStr.length; j++)
			{
			    if(thisStr[j].length() >= minL)
			    b.Insert(thisStr[j]);
			}
			    
		
		}
		
			b.printPostorder(root);
	    System.out.print(temp.key + " "+max);
    		
	}
}