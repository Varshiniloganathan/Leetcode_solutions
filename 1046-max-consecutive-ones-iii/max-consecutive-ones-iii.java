class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l =0;
        int r = 0;
        int maxlen = 0;
        int zc = 0;
        while(r<n){
            if(nums[r]!=1){
                zc++;
            }
            
            while(zc>k){
                if(nums[l]==0) zc--;
                l++;
                
            }
            if(zc<=k){
               maxlen = Math.max(maxlen,r-l+1);
               r++;
            }

            
        }
        return maxlen;
    }
}