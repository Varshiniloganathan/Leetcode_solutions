class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l=0;
        int r = 0;
        int sum = 0;
        int len = 0;
        double avg = Integer.MIN_VALUE;
        while(r<n){
           
           sum+=nums[r];
           len = r-l+1;
           if(len>k){
            sum-=nums[l];
            l++;
            len--;
           }
           if(len == k){
            avg = Math.max(avg,(double)sum/k);
           }
           r++;

        }
        return avg;
        
        
    }
}