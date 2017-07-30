import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static boolean isSafe(int [][]m, int i, int j, int row, int col){
        return (i >= 0 && i < row && j >= 0 && j < col);
    }
    static int count;
    static int min = Integer.MAX_VALUE;
    static void DFS(int [][]m, int i, int j, int row, int col)
    {
        
       // System.out.println(count + " " + (i+1) + " " + (j+1));
        if(i == row - 1 && j == col - 1){
            if(count < min)min = count;
            return;
        }        
        ++count;
       
        if(isSafe(m, i + m[i][j], j, row, col))
        {
            DFS(m, i + m[i][j], j, row, col);
            
        }
        if(isSafe(m, i, j + m[i][j], row, col))
        {
            DFS(m, i, j + m[i][j], row, col);
            
        }
        
        count--;
    }
    static void countMaxJump(int [][]m, int r, int c){
        count = 0;
        DFS(m, 0, 0, r, c);
        System.out.println(min);
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int M[][]=  new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                M[i][j] = scan.nextInt();
            }
        }
       countMaxJump(M, r, c);
       
    }   
	
}