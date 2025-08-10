class Solution {
    public boolean isCorrect(int row,int col,char c,char[][] board){
        for(int i=0;i<9;i++){
            if(i!=col && board[row][i]==c) return false;
            if(i!=row && board[i][col]==c) return false;
            int rin = 3*(row/3)+i/3;
            int cin = 3*(col/3)+i%3;
            if((rin!=row || cin!=col) && board[rin][cin]==c) return false;
        }
        return true;

    }

    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    char c = board[i][j];
                    if(!isCorrect(i,j,c,board)) return false;
                }
            }
        }
        return true;
        
    }
}