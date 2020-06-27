package Number;
//gcd for given two number
public class GCD {
    public static void main(String[] args) {
        int n1,n2 ,gcd;
        n1=131;
        n2=97;
        // let assume n1 is always smallest;
        if(n2%n1==0)   // check n1 is answer
        {
            gcd=n1;
        }
        else
        {
            for(gcd=n1/2;gcd>=1;gcd--)
            {
                if(n2%gcd==0 && n1%gcd==0)
                    break;
            }
        }
        System.out.println(gcd);

    }
}
