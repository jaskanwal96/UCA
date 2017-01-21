
public class SelSort extends mySort{
@Override
protected void sort(){
	 for (int i = 0; i < a.length - 1; i++)
     {
         int index = i;
         for (int j = i + 1; j < a.length; j++)
             if (a[j] < a[index])
                 index = j;
         swap(a,i,index);
     }
   

}
@Override
protected void print(){
	System.out.println("Selection Sort:");
	super.print();

}
public SelSort(int[] a){
	super.a = a;
}
}
