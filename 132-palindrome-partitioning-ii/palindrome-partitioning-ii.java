class Solution {
    public boolean isPalindrome(int left,int right, String s){
        while(left<=right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    public int func(int ind,String s,int[] dp){
        if(ind == s.length()){
            return -1;
        }
        if(dp[ind]!=-2) return dp[ind];
        int mincut = Integer.MAX_VALUE;
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(ind,i,s)){
                int cuts = 1+func(i+1,s,dp);
                mincut = Math.min(cuts,mincut);
            }
        }
        return dp[ind]=mincut;
    }
    public int minCut(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-2);
        return func(0,s,dp);
        
    }
}