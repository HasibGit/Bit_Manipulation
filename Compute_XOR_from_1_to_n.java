import java.util.*;
public class Compute_XOR_from_1_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();
        if(n % 4 == 0){
            System.out.println(n);
        }
        else if(n % 4 == 1){
            System.out.println(1);
        }
        else if(n % 4 == 2){
            System.out.println((n+1));
        }
        else{
            System.out.println(0);
        }
    }
}
