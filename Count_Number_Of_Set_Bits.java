import java.util.*;
public class Count_Number_Of_Set_Bits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int count = 0;

        while (n > 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
}
