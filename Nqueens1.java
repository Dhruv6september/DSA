class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0; i<n; i++)
            Arrays.fill(board[i], '.');
        backtracking(0, board, res, n);
        return res;
    }
    public boolean isSafe(int row, int col, char[][] board, int n)
    {
        for(int j=0; j<col; j++) //for each row
            if(board[row][j]=='Q')
                return false;
        for(int i=row, j=col; i>=0 && j>=0; i--,j--) //this one for upper-diagonal
            if(board[i][j]=='Q')
                return false;
        for(int i=row, j=col; i<n && j>=0; i++, j--)  //this one for lower-diagonal
            if(board[i][j]=='Q')
                return false;
        return true;
    }
    public void backtracking(int col, char[][] board, List<List<String>> res, int n)
    {
        if(col==n)
        {
            List<String> list=new ArrayList<>();
            for(int i=0; i<n; i++)
                list.add(new String(board[i]));
            res.add(list);
            return;
        }
        for(int row=0; row<n; row++)
        {
            if(isSafe(row, col, board, n)){
                board[row][col]='Q';
                backtracking(col+1, board, res, n);
                board[row][col]='.'; //to explore new configuration
                } 
        }
    }
}
