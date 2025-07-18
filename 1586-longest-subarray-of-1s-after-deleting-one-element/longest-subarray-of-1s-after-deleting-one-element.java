class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zc=0;
        int max = 0;
        for(int right=0;right<nums.length;right++){
            
            if(nums[right]==0){
                zc++;
            }
            while(zc>1){
                
                if(nums[left]==0){
                    zc--;
                }
                left++;
            }
            max = Math.max(max,right-left);

        }
        return max;
    }
}