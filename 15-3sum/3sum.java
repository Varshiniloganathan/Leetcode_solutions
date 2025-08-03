class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        //int i = 0;
        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    List<Integer> sub = new ArrayList<>();
                    sub.add(nums[i]);
                    sub.add(nums[j]);
                    sub.add(nums[k]);
                    ans.add(sub);
                    j++;

                }
            else if(sum<0){
                j++;
            }
            else{
                k--;
            }
            }
            
            
            
        }
        return new ArrayList<>(ans);
    }
}