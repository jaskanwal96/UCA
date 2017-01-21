import Practise.BinarySearchTree;


public class ApplicationTree {

	public static void generateTree(char[] str){
		BinarySearchTree bst = new BinarySearchTree();
		balanceBst(bst,str,0,str.length-1);
		bst.display();
	}
	public static void balanceBst(BinarySearchTree bst,char[] str,int L,int R){
		if(L > R)return;
		int m = (L+R)/2;
		bst.Insert(str[m]);
		balanceBst(bst,str,L,m-1);
		balanceBst(bst,str,m+1,R);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SEARCHX";
		char newArray[] = str.toCharArray();
		generateTree(newArray);
		
	}

}
