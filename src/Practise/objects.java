package Practise;

public class objects {
private int n = 2;
private String s = "JAskanwal";
String toStringo(){
	return s;
}

public static void main(String[] args){
	objects a= new objects();
	int i = 10;
	System.out.println("xyz" + i +"abc"+a.toStringo());
}
}