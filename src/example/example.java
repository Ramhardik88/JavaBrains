package example;

public class example {
    public static void main(String[] args) {
        int num;
        num=1;
        long sum = 0;
        while (num<=1000000000)
        {
            if(num%3==0 || num%5==0)
            {
            sum=sum+num;

            }
        //   System.out.print(num+" ");
            num ++;
        }
        System.out.println(sum);

    }
}
