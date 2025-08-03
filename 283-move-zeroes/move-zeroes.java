class Solution {
    public void moveZeroes(int[] nums) {
        /*int l = 0;
        int r = 0;
        while(r<nums.length){
            if(nums[l]==0 && nums[r]!=0){
                nums[l] = nums[r];
                nums[r] = 0;
                l++;
            }
            if(nums[l]!=0){
                l++;
            }
            r++;
            
        }*/
        int pos = 0;
        for(int num:nums){
            if(num!=0){
                nums[pos++] = num;
            }

        }
        while(pos<nums.length){
            nums[pos++] = 0;
        }
        
    }
}