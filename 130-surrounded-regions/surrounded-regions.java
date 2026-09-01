class Solution {

    public void bfs(int i, int j, char[][] board){
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        board[i][j] = '#';
            for(int[] dir: directions){
                int nr = i+dir[0];
                int nc = j+dir[1];
                if(nr>=0 && nr<board.length && nc>=0 && nc<board[0].length && board[nr][nc] == 'O'){
                    bfs(nr,nc,board);
                }
            }
        }
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;

        for(int i=0;i<r;i++){
            if(board[i][0] == 'O'){
                bfs(i,0,board);
            }
            if(board[i][c-1] == 'O'){
                bfs(i,c-1,board);
            }
        }
        for(int i=0;i<c;i++){
            if(board[0][i] == 'O'){
                bfs(0,i,board);
            }
            if(board[r-1][i] == 'O'){
                bfs(r-1,i,board);
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }

        


        
    }
}