package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_13_LongestDivisibleSubSet {
    public static void main(String[] args) {
        int array[]={3,4,16,8};
        List<Integer> arr = isSolution(array);
//        for (int num:arr) {
//            System.out.println(num+" ");
//
//        }
        System.out.println(arr);
    }

    private static List<Integer> isSolution(int[] array) {
        Arrays.sort(array);
        int n=array.length;

        List<Integer> result= new ArrayList<>();
        int dp[]= new int[n+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=1;
        }
        int max=1;

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++) {
                if (array[i] % array[j] == 0 && 1 + dp[j] > dp[i]){
                    dp[i]=1+dp[j];
                    if(max<dp[i])
                    {
                        max=dp[i];
                    }
                }

            }
        }

        int prev=-1;
        for(int i=n-1;i>=0;i--)
        {
            if(dp[i]==max && (prev%array[i]==0 || prev==-1))
            {
                result.add(array[i]);
                max=max-1;
                prev=array[i];
            }
        }
       return  result;
    }
}
