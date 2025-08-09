class Solution {
    public void func(int ind,int[] nums,List<List<Integer>> ans){
        if(ind == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(ds);
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            func(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    public void swap(int i,int ind,int[] nums){
        int temp = nums[ind];
        nums[ind]=nums[i];
        nums[i]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(0,nums,ans);
        return ans;
    }
}