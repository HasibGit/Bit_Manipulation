
import java.util.*;
public class XOR_Of_All_Subsets_Of_A_Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(5);
        set.add(8);

        if(set.size() > 1){
            System.out.println(0);
        }
        else{
            for(int i : set){
                System.out.println(i); // only one element
            }
        }
    }
}
