package Practise;

import java.util.ArrayList;

public class Strings14sept {
	public static void main(String[] args){
//		Integer i1 = new Integer(10);
//		Integer i2 = new Integer(10);
//		int i3 = 10;
//		int i4 = 10;
//		System.out.println(i1.equals(i2));
//		System.out.println(i3==i4);
//		String s1 = new String("ABC");
//		String s2 = new String("ABC");
//		String s3 = "ABC";
//		String s4 = "ABC";
//		System.out.println(s1.equals(s2));
//		System.out.println(s3==s4);
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.get(0);
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
	    ArrayList<Integer> great = new ArrayList<Integer>();
	    int b = 3;
	    ArrayList<Integer> merge = new ArrayList<Integer>();
	    al.add(1);
	    al.add(4);
	    al.add(3);
	    al.add(2);
	    al.add(5);
	    al.add(2);
	    for(int i = 0; i < al.size(); i++){
	        System.out.println(al);	 
	    	if(b <= al.get(i))
	        {
	            
	            great.add(al.get(i));
	            al.remove(i);
	            i--;
	        }
	    }
	    merge.addAll(al);
	    merge.addAll(great);

	}
}
