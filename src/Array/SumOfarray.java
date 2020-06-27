package Array;

public class SumOfarray {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7};

        isSolution(num);

    }
    private static void isSolution(int[] num) {

        for(int i=1;i<=num.length-1;i++)
        {
             num[i]+=num[i-1];
        }

        for(int i=0;i<=num.length-1;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}
