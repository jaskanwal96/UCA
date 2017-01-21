package Study;

import java.util.Scanner;
interface Names{
	public void sayName(String name);
}
interface Batista{
	public void batistaBomb();
}
 class example implements Names,Batista{

	@Override
	public void sayName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Kidaa "+ name);
	}

	@Override
	public void batistaBomb() {
		// TODO Auto-generated method stub
		System.out.println("Batista Bomb");
	}
	
}
public class Solution {
	public static void main(String[] args)
	{
		example ex = new example();
		ex.sayName("lump");
		
	}
}
