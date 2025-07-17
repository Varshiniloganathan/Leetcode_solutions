class Solution {
    public int fn(int i,int[] dp){
        if(i==2 || i==1) return i;
        if(dp[i]!=-1){
            return dp[i];
        }
        int onestep = fn(i-1,dp);
        int twostep = fn(i-2,dp);
        return dp[i] = onestep + twostep;

    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = fn(n,dp);
        return ans;
        
    }
}