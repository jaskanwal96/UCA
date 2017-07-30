import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static boolean isSafe(int [][]arr, int i, int j, int num)
    {
        
        for(int k = 0; k < 9; k++){
            if(arr[i][k] == num)return false;
        }
        for(int k = 0; k < 9; k++){
            if(arr[k][j] == num)return false;
        }
        int fi = i % 3;;
        int fj = j % 3;
        fi = i - fi;
        fj = j - fj;
        for(int k = fi; k < fi + 3; k++)
		{
		    for(int l = fj; l < fj + 3; l++)
		    {
		        if(arr[k][l] == num)return false;
		    }
		}
        return true;
    }
    static boolean FindLocations(int [][]arr, int []location)
    {
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(arr[i][j] == 0)
                {
                    location[0] = i;
                    location[1] = j;
                    return true;
                }
            }
        }
        return false;
    }
    static boolean Sudoku(int [][]arr){
        int []location = new int[2];
        if (!FindLocations(arr, location))return true; 
        int row = location[0],col = location[1];
        for(int i = 1; i <= 9; i++)
        {
            if(isSafe(arr, row, col, i)){
                arr[row][col] = i;
                if(Sudoku(arr))return true;
            
                arr[row][col] = 0;  
            }    
            
        }
        //This triggers backtracking
        return false;
    }
	public static void main (String[] args) {
		int [][]arr = new int[9][9];
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- != 0){
			for(int i = 0; i < 9; i++)
			{
			    for(int j = 0; j < 9; j++)
			    {
			        arr[i][j] = scan.nextInt();
			    }
			}
			Sudoku(arr);
			for(int i = 0; i < 9; i++)
			{
			    for(int j = 0 ; j < 9; j++)
			    {
			        System.out.print(arr[i][j] + " ");
			    }
			   // System.out.println();
			}
		System.out.println();
	}
	    
	}
}