/**
 * 
 */
package Practise;

import java.util.Iterator;

/**
 * @author Jaskanwal
 *
 */
class GraphMangla {
	class Bag implements Iterable<Integer>{
        class Node{
            int data;
            Node next;
            Node( int N ){
                data = N;
                next = null;
            }
        }
        private Node first , last;
        private int N;
        public void enque( int n ){
            Node curr = last;
            last = new Node( n );
            if( size() == 0 ) first = last;
            else curr.next = last;
        }
        public int size(){
            int count = 0;
            Node curr = first;
            while( curr != null ){
                count++;
                curr = curr.next;
            }
            return count;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new CustomIterator();
        }
        private class CustomIterator implements Iterator<Integer> {
            Node curr = first;
            @Override
            public Integer next() {
                Node t = curr;
                curr = curr.next;
                return t.data;
            }
            @Override
            public boolean hasNext() {
                return curr!=null;
            }
            
        }    
    }
    int v , E ;
    Bag[] adj;
    GraphMangla( int v ){
        E = 0;
        this.v = v;
        adj = new Bag[ v ];
        for( int i = 0 ; i < v ; i++ ) adj[i] = new Bag();
    }
    void addEdge( int V , int W ){
        adj[V].enque(W);
        adj[W].enque(V);
        if( V == W ) E += 1;
        else E += 2;
    }
    int[] ad( int v ){
        int arr[] = new int[ adj[v].size() ] , i = 0;
        Iterator it = adj[ v ].iterator();
        while( it.hasNext() ){
            arr[ i++ ] = (int)it.next();
        }
        return arr;
    }
    public static void main(){
        GraphMangla g = new GraphMangla( 7 );
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(5,6);
        int arr[] = g.ad( 0 );
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print( arr[ i ] + " " );
    }
}
