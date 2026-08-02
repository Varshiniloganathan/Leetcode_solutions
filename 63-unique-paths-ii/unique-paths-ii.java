class Solution {
    public int recur(int[][] grid,int m,int n,int[][] dp){
        if(m<0 || n<0) return 0;
         if(m==0 && n==0 && grid[m][n]!=1){
            return 1;
        }
         if(grid[m][n] == 1){
            return 0;
        }
        if(dp[m][n]!=-1) return dp[m][n];
       
        return dp[m][n] = recur(grid,m-1,n,dp)+recur(grid,m,n-1,dp);

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return recur(obstacleGrid,m-1,n-1,dp);
       

        
    }
}