package Practise;

//Red Black Tree
public class RBTree
{
	
	  private static final boolean RED = true;
	    private static final boolean BLACK = false;
	    public Node root = null;
	    
	    class Node {
	        private int key;
	        private Node left;
	        private Node right;
	        private boolean color;
	        
	        public Node(int key) {
	            this.key = key;
	            this.left = null;
	            this.right = null;
	            this.color = RED;
	        }
	    }
	        
	        public void insert(int key) {
	            root = insert(root, key);
	        }
	        
	        private Node insert(Node root, int key) {
	            if(root == null) return new Node(key);
	            if(key < root.key) root.left = insert(root.left, key);
	            else if(key > root.key) root.right = insert(root.right, key);
	            
	            if( !isRed(root.left) && isRed(root.right) ) root = rotateLeft(root);
	            if( isRed(root.left) && isRed(root.left.left) ) root = rotateRight(root);
	            if( isRed(root.left) && isRed(root.right) ) flipColors(root);
	            
	            return root;
	        }
	        
	        private void flipColors(Node root) {
	            root.left.color = BLACK;
	            root.right.color = BLACK;
	            root.color = RED;
	        }
	        
	        private Node rotateLeft(Node root) {
	            Node h = root.right;
	            root.right = h.left;
	            h.left = root;
	            h.color = root.color;
	            root.color = RED;
	            return h;
	        }
	        
	        private Node rotateRight(Node root) {
	            Node h = root.left;
	            root.left = h.right;
	            h.right = root;
	            h.color = root.color;
	            root.color = RED;
	            return h;
	        }
	        
	        public boolean isRed(Node root) {
	            if(root == null)
	                return false;
	            return root.color == RED;
	        }
	        
	        public int height() {
	            return height(root);
	        }
	        
	        private int height(Node root) {
	            if(root == null) return 0;
	            return 1 + Math.max( height(root.left), height(root.right));
	        }
	        
	        public void inOrder() {
	            inOrder(root);
	        }
	        
	        private void inOrder(Node root) {
	            if(root == null) return;
	            inOrder(root.left);
	            
	           inOrder(root.right);
	           System.out.println(root.key);
	        }
	       
	    public static void main(String args[]) {
	        RBTree rbt = new RBTree();
	        rbt.insert(5);
	        rbt.insert(4);
	        rbt.insert(3);
	        rbt.insert(2);
	        rbt.insert(1);
	        System.out.println( "Height : " + rbt.height());
	        rbt.inOrder();
	    }
	
}
