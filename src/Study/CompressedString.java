package Study;

public class CompressedString {
	private static String Compress(String a) {
		int count = 0;
		String newString = "";
		for(int i = 1; i < a.length() ; i++)
		{
			if(a.charAt(i - 1) == a.charAt(i))
			{
				count++;
			}
			else
			{
				if((count) > 0)
				{
					Integer f = count + 1;
					newString += (a.charAt(i -1 ) + (f).toString());
				}
				else
					if((count) == 0)
					{
						newString += a.charAt(i-1);
					}
				count = 0;
			}
		}
		return newString ;
	}
	public static void main(String[] args)
	{
		String a = "aaaaabbbbbbbbbcccdpqrrr";
		System.out.println(Compress(a));
	}

	
}
