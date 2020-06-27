package dynamicprogramming;

public class No_14_Dungeon_Game {
    public static void main(String[] args) {
        int dungeon[][]={
                {-2,-3,3},
                {-5,-10,1},
                {10,30,-5}};

        System.out.println(isSolution(dungeon));
    }

    private static int isSolution(int[][] dungeon) {
        int r =dungeon.length;
        int c =dungeon[0].length;
        int dp[][]= new int[r][c];

        for(int i=r-1;i>=0;i--)
        {
            for(int j=c-1;j>=0;j--)
            {
                if(i==r-1 && j==c-1)
                {
                    dp[i][j]=Math.min(0,dungeon[i][j]);
                }
                else if(i==r-1)
                {
                    dp[i][j]=Math.min(0,dungeon[i][j]+dp[i][j+1]);
                }
                else if(j==c-1)
                {
                    dp[i][j]=Math.min(0,dungeon[i][j]+dp[i+1][j]);
                }
                else
                {
                    dp[i][j]=Math.min(0,dungeon[i][j]+Math.max(dp[i][j+1],dp[i+1][j]));
                }



            }
        }
                return Math.abs(dp[0][0])+1;

    }
}
