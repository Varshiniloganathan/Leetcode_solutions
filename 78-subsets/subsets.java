class Solution {
    public void func(int ind, int[] nums,List<List<Integer>> ans, List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i = ind;i<nums.length;i++){
            ds.add(nums[i]);
            func(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(0,nums,ans,new ArrayList<>());
        return ans;
        
    }
}