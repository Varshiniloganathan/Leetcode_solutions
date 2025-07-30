class Solution {
    public int func(int[] nums,int k){
        int n = nums.length;
        if(k<0) return 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        int cnt=0;
        while(r<n){
            sum+=(nums[r]%2);
            while(sum > k){
                sum-=(nums[l]%2);
                l++;
            }
            if(sum <= k){
                cnt = cnt+(r-l+1);
            }
            r++;
        }
        return cnt;

    }
    public int numberOfSubarrays(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);
    }
}