class Solution {
    public int recur(int n, int[] dp){
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n==0 || n==1){
            return 1;
        }
        dp[n] = recur(n-2,dp)+recur(n-1,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(n,dp);

        
    }
}