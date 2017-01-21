package Practise;

public class justTryIt {
	
		 static void Swap(int[] a,int l,int r)
		{
			 if(l<r){
			 a[l] = a[r] = a[l]+a[r];
			 Swap(a,++l,--r);
		}
			 else
				 return;
		}
	 	public static void main(String[] args)
	 	{
	 		int []a = {1,2,3,4,5,6,7,8};
	 		Swap(a,0,a.length-1);
	 		for(int i = 0; i < a.length-1; i++)
	 		System.out.print(a[i]+" ");
	 	}

}
