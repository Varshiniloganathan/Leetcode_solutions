class Solution {
    public int bfs(int i, int j, char[][] grid, int[][] visited){
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        visited[i][j] = 1;
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int[] point = q.poll();
            int r = point[0];
            int c = point[1];
            for(int[] dir:directions){
                int nr = r+dir[0];
                int nc = c+dir[1];
                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc] == '1' && visited[nr][nc]!=1){
                    bfs(nr,nc,grid,visited);
                }

            }
        }
        return 1;

    }
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] visited = new int[r][c];
        int cnt=0;
        for(int i = 0; i<r;i++){
            for(int j=0; j<c;j++){
                if(grid[i][j]!='0' && visited[i][j] != 1){
                    cnt+=bfs(i,j,grid,visited);
                }
            }
        }
        return cnt;
        
    }
}