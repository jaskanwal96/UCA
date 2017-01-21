package Interclass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Class1 {
	public class subClass1{
		private int num = 0;
		public int getnum(){
			return num;
		}
		
	}
	public class subClass2 extends subClass1{
		subClass2(){
			
		}
	}
	
	public interface Interface{
		
	}
		private static boolean isPrime(int num) {
		if(num == 1)return false;
        if(num == 2 )return true;
		if (num % 2 == 0) return false;
        for (int i = 3; i * i < num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
    public static void main(String args[] ) throws Exception {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0; i < T; i++)
		{
			int N = scan.nextInt();
			Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
			for(int j = 1; j <= Math.sqrt(N); j++)
			{
				if(N % j == 0)
				{
					if(!isPrime(j) && !isPrime(N/j))
					mp.put(j,N/j);
				}
					
			}
		if(mp.size() > 1)
		System.out.println(mp.size());
		else
		System.out.println(-1);
		
			
		}
		
	}
	
}
