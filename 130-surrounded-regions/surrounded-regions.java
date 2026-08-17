class Solution {
    public void bfs(int r, int c, char[][] board) {
        int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        board[r][c] = '#';
        for(int[] dir : directions){
            int nr = r + dir[0];
            int nc = c + dir[1];

            if(nr>=0 && nr<board.length && nc>=0 && nc<board[0].length && board[nr][nc] == 'O'){
                bfs(nr,nc,board);
            }
        }
        
       

    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int r=0;r<m;r++){
            if(board[r][0] == 'O'){
                bfs(r,0,board);
            }

            if(board[r][n-1] == 'O'){
                bfs(r,n-1,board);
            }
        }
        
        for(int c=0;c<n;c++){
            if(board[0][c] == 'O'){
                bfs(0,c,board);
            }
            if(board[m-1][c]== 'O'){
                bfs(m-1,c,board);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '#') board[i][j] = 'O';
            }
        }
    }
}