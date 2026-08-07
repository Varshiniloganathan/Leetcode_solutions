class Solution {
    public int dfs(int row, int col, char[][] grid,int[][] visited){
        if(row <0 || col<0 || row>=grid.length || col>= grid[0].length){
            return 0;
        }
        if(visited[row][col] == -1) return 0;
        
        if(visited[row][col] != -1 && grid[row][col] != '0'){
            visited[row][col] = -1;
            dfs(row+1, col, grid, visited);
            dfs(row-1, col, grid, visited);
            dfs(row, col+1, grid, visited);
            dfs(row, col-1, grid, visited);

        }
        return 1;


    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        System.out.println(m);
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!= '0'){
                    ans+= dfs(i, j, grid, visited);
                }
            }
        }
        return ans;
        
    }
}