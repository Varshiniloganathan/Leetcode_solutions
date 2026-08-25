class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int len = 0;
        int minLen = nums.length+1;
        int i = 0;
        for(int j = 0; j<nums.length; j++){
            sum+=nums[j];
            len = j-i+1;
            // if(sum >= target){
            //     // len = j-i+1;
            //     minLen = Math.min(minLen, len);
            // }
            while(sum >= target  ) {
                minLen = Math.min(minLen, len);
                sum -= nums[i];
                len--;
                i++;
            }
            

            
        }

        if(minLen == nums.length+1) return 0;


        return minLen;

        
        
    }
}