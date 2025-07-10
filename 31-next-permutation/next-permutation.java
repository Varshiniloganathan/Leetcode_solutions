class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int bp = -1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                bp = i-1;
                break;
            }
        }
        if (bp != -1) {
            for (int i = n - 1; i > bp; i--) {
                if (nums[i] > nums[bp]) {
                    int temp = nums[i];
                    nums[i] = nums[bp];
                    nums[bp] = temp;
                    break;
                }
            }
        }
        int l=bp+1;
        int r = n-1;
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        
    }
}