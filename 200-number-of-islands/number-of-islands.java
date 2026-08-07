class Solution {
    public int bfs(int row, int col, char[][] grid, Set<String> visited) {

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        String pos = row + " " + col;
        visited.add(pos);
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row,col});
        while(!q.isEmpty()){
            int[] point = q.poll();
            int r = point[0];
            int c = point[1];
            for(int[] dir : directions) {
                int nr = r + dir[0], nc = c+dir[1];
                if(nr>=0 && nc>=0 &&nr<grid.length && nc<grid[0].length && grid[nr][nc] == '1' && !visited.contains(nr + " " + nc)) {
                    
                    bfs(nr, nc, grid, visited);
                    
                }
            }

        }

        return 1;
        // if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
        //     return 0;
        // }
        //  String pos = row + " " + col;

        // if (grid[row][col] == '0')
        //     return 0;
        // if (visited.contains(pos))
        //     return 0;

        // visited.add(pos);
        // dfs(row + 1, col, grid, visited);
        // dfs(row - 1, col, grid, visited);
        // dfs(row, col + 1, grid, visited);
        // dfs(row, col - 1, grid, visited);

        // return 1;

    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // int[][] visited = new int[m][n];
        Set<String> visited = new HashSet<>();
        int ans = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '0' && !visited.contains(i+" "+j)) {
                    ans += bfs(i, j, grid, visited);
                }
            }
        }
        return ans;

    }
}