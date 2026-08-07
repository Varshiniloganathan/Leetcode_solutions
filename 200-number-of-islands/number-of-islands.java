class Solution {
    public int dfs(int row, int col, char[][] grid, Set<String> visited) {
       
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return 0;
        }
         String pos = row + " " + col;

        if (grid[row][col] == '0')
            return 0;
        if (visited.contains(pos))
            return 0;

        visited.add(pos);
        dfs(row + 1, col, grid, visited);
        dfs(row - 1, col, grid, visited);
        dfs(row, col + 1, grid, visited);
        dfs(row, col - 1, grid, visited);

        return 1;

    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // int[][] visited = new int[m][n];
        Set<String> visited = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '0') {
                    ans += dfs(i, j, grid, visited);
                }
            }
        }
        return ans;

    }
}