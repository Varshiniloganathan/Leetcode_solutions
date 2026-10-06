class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int minlen = 999999;
        while(r<nums.length){
            sum += nums[r];
            while(sum>=target){
                if(r-l+1 < minlen){
                    minlen = r-l+1;
                }
                sum-=nums[l];
                l++;
            }
            if(sum == target){
                minlen = Math.min(r-l+1,minlen);
            }
            
            r++;
            

        }
        if(minlen == 999999) return 0;
        return minlen;
    }
}