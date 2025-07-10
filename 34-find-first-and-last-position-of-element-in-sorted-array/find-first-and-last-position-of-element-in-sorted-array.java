class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l =0;
        int r = n-1;
        int[] ans = {-1,-1};
            while(l<n && nums[l]!=target){
                l++;
            }
            while(r>=0 && nums[r]!=target){
                r--;
            }
            if(l<=r && nums[l]==target && nums[r] == target){
                ans[0] = l;
                ans[1] = r;

            }
        
        return ans;
        
    }
}