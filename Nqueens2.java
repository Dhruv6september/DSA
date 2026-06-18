class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char[][] board= new char[n][n];
        for(int i=0; i<n; i++)
            Arrays.fill(board[i], '.');
        backtracking(0, board, n);
        return count;
    }
    public boolean isSafe(int row, int col, char[][] board, int n)
    {
        for(int j=0; j<col; j++)
            if(board[row][j]=='Q')
                return false;

        for(int i=row, j=col; i>=0 && j>=0; i--, j--)
            if(board[i][j]=='Q')
                return false;

        for(int i=row, j=col; i<n && j>=0; i++, j--)
            if(board[i][j]=='Q')
                return false;

        return true;
    }

    public void backtracking(int col, char[][] board, int n)
    {
        if(col==n)
        {
            count++;
            return;
        }
        for(int row=0; row<n; row++)
        {
            if(isSafe(row, col, board, n))
            {
                board[row][col]='Q';
                backtracking(col+1, board, n);
                board[row][col]='.';
            }
        }
    }
}
