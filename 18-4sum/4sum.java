class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            //if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                //if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum =1L *  nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target){
                        List<Integer> sub = new ArrayList<>();
                        sub.add(nums[i]);
                        sub.add(nums[j]);
                        sub.add(nums[k]);
                        sub.add(nums[l]);
                        ans.add(sub);
                        //ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        //while(k<l && nums[k]==nums[k+1]) k++;
                        //while(k<l && nums[l]==nums[l-1]) l--; 

                        k++;
                        l--;

                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        k++;

                    }
                }
            }
        }
        return new ArrayList<>(ans);
        
    }
}