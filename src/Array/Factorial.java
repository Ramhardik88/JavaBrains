package Array;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       int n=5;
     int ans=  isSolution(n);
        System.out.println(ans);
    }

    private static int isSolution(int n) {
        int result;
        if(n==1)
        {
            return 1;
        }
        else {
          result =  n*isSolution(n-1);

        }
        System.out.println(result);
        return result;
    }
}
