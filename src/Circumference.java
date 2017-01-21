import Practise.BinarySearchTree;
import Practise.BinarySearchTree.Node;


public class Circumference {
	public static void printCircumference(Node root){
		leftPrint(root);
		printLeaves(root);
		rightPrint(root.right);
	}
	public static void leftPrint(Node root){
		if(root == null)
			return;
		if(root.left!=null || root.right!=null)
		System.out.print(root.key+" ");
		leftPrint(root.left);
		
	}
	public static void printLeaves(Node root){
		if(root == null)return;
		printLeaves(root.left);
		if(root.left == null && root.right==null)
			System.out.print(root.key+" ");
		printLeaves(root.right);
		
		
	}
	public static void rightPrint(Node root){
		if(root == null )
			return;
		
		rightPrint(root.right);
		if(root.left!=null || root.right!=null)
		System.out.print(root.key+" ");
	}
	public static void main(String[] args){
		BinarySearchTree bst  = new BinarySearchTree();
		Node root = bst.Insert(30);
		bst.Insert(20);
		bst.Insert(10);
		bst.Insert(5);
		bst.Insert(15);
		bst.Insert(25);
		bst.Insert(28);
		bst.Insert(40);
		bst.Insert(35);
		bst.Insert(50);
		bst.Insert(41);
		
		printCircumference(root);
		
		
		
	}
	
}
