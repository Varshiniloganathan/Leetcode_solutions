class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int num:nums){
            max = Math.max(num,max);
             
        }
        int r=0;
        int l=0;
        int maxlen = 0;
        while(r<n){
            if(nums[r] != max){
                l=r;
                l++;
                //r++;
            }
            else{
                maxlen = Math.max(maxlen,r-l+1);
                //r++;
            }
            r++;


        }
        return maxlen;
        
    }
}