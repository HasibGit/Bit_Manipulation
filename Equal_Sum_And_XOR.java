/*
      given n, from i = 0 to n, we have to find the number of i's where
      i + n = i ^ n

      here, if i & n = 0, then i + n == i ^ n

      we have to find all i's where i & n = 0

      for that, we have to count number of unset bits in n, -> x

      the result will be 2^x

 */

import java.util.*;
public class Equal_Sum_And_XOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();
        int unsetBits = 0;

        while (n > 0){
            if((n & 1) == 0){
                unsetBits++;
            }
            n = n / 2;
        }
        System.out.println(Math.pow(2,unsetBits));
    }
}
