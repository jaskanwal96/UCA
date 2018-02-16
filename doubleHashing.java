// C++ program to approximate number of people in Birthday Paradox 
// problem
import java.util.Arrays;
class Gfg{
    static final int TABLE_SIZE = 13; 
    static int []table;
    static int curr_size;
    Gfg(){
        table = new int[TABLE_SIZE];
        Arrays.fill(table, -1);
    }
    static int hash1(int num){
        return num % TABLE_SIZE;
    }
    
    static int hash2(int num){
        return (7 - ( num % 7));
    }
    static boolean isFull(){
        return curr_size == TABLE_SIZE;
    }
    void insertHash(int key){
        if (isFull())
            return;
 
        // get index from first hash
        int index = hash1(key);
 
        // if collision occurs
        if (table[index] != -1)
        {
            // get index2 from second hash
            int index2 = hash2(key);
            int i = 1;
            while (true)
            {
                // get newIndex
                int newIndex = (index + i * index2) %
                                        TABLE_SIZE;
 
                // if no collision occurs, store
                // the key
                if (table[newIndex] == -1)
                {
                    table[newIndex] = key;
                    break;
                }
                i++;
            }
        }
 
        // if no collision occurs
        else
            table[index] = key;
        curr_size++;
    }
    void displayHash(){
        for(int i = 0; i < table.length; i++)
        {
            System.out.print(i);
            if(table[i]!=-1){
                System.out.println("--->" + table[i]);   
            }
            else
            System.out.println();
        }
    }
    public static void main(String[] args){
        int []a = new int[]{19, 27, 36, 10, 64};
        Gfg obj = new Gfg();
        for(int i = 0; i < a.length; i++)
        obj.insertHash(a[i]);
        
        obj.displayHash();
        
    }
}
