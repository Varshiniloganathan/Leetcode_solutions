class Solution {
    /*public boolean isPlace(int col,int row,char[][] board){
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


    }*/
    public void func(int col,int[] leftrow,int[] lowerdiagonal,int[] upperdiagonal,char[][] board,List<List<String>> ans){
        if(col == board.length){
        List<String> sol = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                sol.add(new String(board[i])); 
            }
            ans.add(sol);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(leftrow[row]==0 && lowerdiagonal[row+col]==0 && upperdiagonal[board.length - 1 + col - row]==0){
                board[row][col] = 'Q';
                leftrow[row]=1;
                lowerdiagonal[row+col]=1;
                upperdiagonal[board.length - 1 + col - row] = 1;
                func(col+1,leftrow,lowerdiagonal,upperdiagonal,board,ans);
                leftrow[row]=0;
                lowerdiagonal[row+col]=0;
                upperdiagonal[board.length - 1 + col - row] = 0;
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
        int[] leftrow = new int[n];
        int[] lowerdiagonal = new int[2*n-1];
        int[] upperdiagonal = new int[2*n-1];
        
        func(0,leftrow,lowerdiagonal,upperdiagonal,board,ans);
        return ans;
        
    }
}