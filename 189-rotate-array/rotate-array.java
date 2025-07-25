class Solution {
    public int[] reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k == 0) return;
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);
        
        
    }
}