class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        while(r<nums.length){
            if(nums[l]==0 && nums[r]!=0){
                nums[l] = nums[r];
                nums[r] = 0;
                l ++;
            }
            if(nums[l]!=0){
                l++;
            }
            r++;
            
        }
        
    }
}