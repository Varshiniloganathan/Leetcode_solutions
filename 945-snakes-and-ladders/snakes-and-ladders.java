class Solution {
    public int[] getcoord(int next, int n){
        int r = (next-1)/n , c = (next-1)%n;
        int row = n-1-r;
        int col = (r%2 == 0) ? c : (n-1-c);
        return new int[]{row,col};
    }
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        Queue<int[]> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(new int[]{1,0});
        visited.add(1);
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int pos = curr[0],moves = curr[1];
            for(int i=1;i<=6 && pos+1 <= n*n;i++){
                int next = pos+i;
                int[] coord = getcoord(next,n);
                int r = coord[0],c = coord[1];
                if(board[r][c]!=-1){
                    next = board[r][c];
                }

                if(next == n*n ) return moves+1;
                if(!visited.contains(next)){
                    visited.add(next);
                    q.add(new int[]{next,moves+1});
                }
            }
        }
        return -1;
        
    }
}