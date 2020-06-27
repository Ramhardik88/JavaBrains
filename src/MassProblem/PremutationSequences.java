package MassProblem;

import java.util.ArrayList;
import java.util.List;

public class PremutationSequences {
    public static void main(String[] args) {
        int N=4;int k=15;
        System.out.println(getPermution(N,k));
    }

    private static String getPermution(int n, int k) {
        int fact[]= new int[n+1];
        List<Integer> number= new ArrayList<>();

        fact[0]=fact[1]=1;
        for(int i=2;i<fact.length;i++)
        {
            fact[i]=fact[i-1]*i;
        }
        for(int i=1;i<=n;i++) {
            number.add(i);

        }
        StringBuilder sb= new StringBuilder();
        while (n>0)
        {
            int index=k/fact[n-1];
            if(k%fact[n-1]==0)
            {
                index--;
            }
            sb.append(number.get(index));
            number.remove(index);
            k=k-fact[n-1]*index;
            n--;
        }
        return sb.toString();

    }
}
