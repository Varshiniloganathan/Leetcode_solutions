class Solution {
    public int func(int i,int j,int[][] grid,int[][] dp){
        if(i<0 || j<0) return 0;
        if(grid[i][j]==1){
            return 0;
        }
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int up = func(i-1,j,grid,dp);
        int left = func(i,j-1,grid,dp);
        return dp[i][j] = up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int c = obstacleGrid[0].length;
        int r = obstacleGrid.length;
        int[][] dp = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dp[i][j] = -1;
            }
        }
        return func(r-1,c-1,obstacleGrid,dp);
        
    }
}