package example;

public class Stars {
    public static void main(String[] args) {
        int N,row,col;
        N=5;
        for(row=1;row<=N;row++,  System.out.println())
        {
            for(col=1;col<=N;col++)
            {
                System.out.print("*");
            }
        }
        for(row=1;row<=N;row++,  System.out.println())
        {
            for(col=1;col<=row;col++)
            {
                System.out.print("*");
            }
        }
        N=7;
        for(row=N;row<=N;row--,  System.out.println())
        {
            for(col=row;col<=N;col++)
            {
                System.out.print("*");
            }
        }
    }
}
