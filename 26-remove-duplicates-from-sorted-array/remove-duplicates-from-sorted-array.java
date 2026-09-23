class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i+1;
        // int k = 0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                nums[++i] = nums[j];
                // k++;
            }
            j++;
        }
        return i+1;
        
    }
}