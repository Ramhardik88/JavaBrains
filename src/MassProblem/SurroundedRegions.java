package MassProblem;

public class SurroundedRegions {
    public static void main(String[] args) {
        char[][] board={{'X', 'X', 'X', 'X'},
                        {'X','O','O','x'},
                        {'X','X','O','X'},
                        {'X','O','x','x'}};

        isSolution(board);
    }

    private static void isSolution(char[][] board) {
        if(board.length==0)
            return;
        int row=board.length;
        int col=board[0].length;

        for(int i=0;i<row;i++)
        {
            dfs(board,i,0);
            dfs(board,i,col-1);
        }
        for(int j=1;j<col-1;j++)
        {
            dfs(board,0,j);
            dfs(board,row-1,j);
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]=='O')
                    board[i][j]='x';
                else if(board[i][j]=='1')
                    board[i][j]='O';
            }
        }


    }

    private static void dfs(char[][] board, int i, int j) {
        if(board[i][j]=='O')
            board[i][j]='1';

        if(i+1<board.length)
            dfs(board,i+1,j);
        if(i>1)
            dfs(board,i-1,j);
        if(j+1<board[i].length)
            dfs(board,i,j+1);
        if(j>1)
            dfs(board,i,j-1);
    }


}
