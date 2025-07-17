class Solution {
    public int fn(int i,int[] dp){
        if(i == 0 || i==1) return i;
        if(dp[i]!=-1){
            return dp[i];
        } 
        return dp[i] = fn(i-1,dp) + fn(i-2,dp);
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = fn(n,dp);
        return ans;
        
         
    }
}