class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 2;
        for(int r=2;r<nums.length;r++){
            if(nums[l-2]!=nums[r]){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
        
    }
}