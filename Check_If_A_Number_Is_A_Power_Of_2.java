
import java.util.*;
public class Check_If_A_Number_Is_A_Power_Of_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n != 0 && ((n & (n-1)) == 0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
