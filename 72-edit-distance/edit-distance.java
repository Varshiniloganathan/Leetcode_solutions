class Solution {
    public int f(int i,int j,String word1,String word2,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)){
            
            return dp[i][j]=0+f(i-1,j-1,word1,word2,dp);
        }
        int insert = 1+f(i,j-1,word1,word2,dp);
        int delete = 1+f(i-1,j,word1,word2,dp);
        int update = 1+f(i-1,j-1,word1,word2,dp);
        return dp[i][j] = Math.min(insert,Math.min(delete,update));
    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n = word2.length();
        int[][] dp = new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans = f(m-1,n-1,word1,word2,dp);
        return ans;
        
    }
}