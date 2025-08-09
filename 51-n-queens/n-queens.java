class Solution {
    public boolean isPlace(int col,int row,char[][] board){
        int r = row;
        int c = col;
        while(row>=0 && col>=0){
            if(board[row][col] =='Q') return false;
            row--;
            col--;
        }
        row = r;
        col = c;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        row = r;
        col = c;
        while(col>=0 && row<board.length){
            if(board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;


    }
    public void func(int col,char[][] board,List<List<String>> ans){
        if(col == board.length){
            List<String> sol = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                sol.add(new String(board[i])); 
            }
            ans.add(sol);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isPlace(col,row,board)){
                board[row][col] = 'Q';
                func(col+1,board,ans);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        func(0,board,ans);
        return ans;
        
    }
}