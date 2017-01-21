package Study;

public class milly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       	String str = "admylqi";
       	String str2 = "milly";
       	int j = 0;
       	for(int i = 0; i < str.length(); i++)
       	{
       		if(str.charAt(i) == str2.charAt(j))
       		{
       			j++;
       		}
       		if(j == str2.length())break;
       	}
       	if(j == str2.length())
       	System.out.println("Milly is Intelligent");
       	else
       		System.out.println("Milly is not Intelligent");
       		
	}

}
