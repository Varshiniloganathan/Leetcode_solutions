class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int mindiff = Integer.MAX_VALUE;
        int cs = 0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    j++;
                }
                int diff = Math.abs(target-sum);
                if(diff < mindiff){
                    mindiff = diff;
                    cs = sum;
                }

            }

        }
        return cs;
    }
}