package Practise;
class Cars{
	int speed;
	float price;
	Cars(int s,int p){
		speed = s;
		price = p;
	}
	int getSpeed(){
		return speed;
		
	}
	float getPrice(){
		return price;
	}
}
class bySpeed implements Comparable
{
	int speed = 200;
	@Override
	public int compareTo(Object o) {
		Cars tmp = (Cars)o;
		if(((Cars) o).getSpeed()>speed)
			return 1;
		return 0;
	}
	
}
public class Comparablejj {
	
	public static void main(String[] args){
	 Cars c1 = new Cars(240,250000);
	 Cars c2 = new Cars(120,125000);
	 Comparable tt = new bySpeed();
	 if(tt.compareTo(c1)==1)System.out.print("Ultraspeed Category");
	 else
		 System.out.print("Not that fast");
	 if(tt.compareTo(c2)==1)System.out.print("Ultraspeed Category");
	 else
		 System.out.print("Not that fast");
	}
	
	
}
