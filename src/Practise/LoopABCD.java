package Practise;

public class LoopABCD {

	public static void main(String[] args) {
		int n = 6;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print((char)(j+65));
			}
			
			for(int l = 0; l < (2*(i-1))+1 ; l++)
			{
				if(i == 0)
					break;
			System.out.print("*");
			}
			for(int k = n - i - 1; k >= 0; k-- )
			{
				if(k == n-1)
					continue;
				System.out.print((char)(k+65));		
			}
			System.out.println();
		}
		
	}

}
