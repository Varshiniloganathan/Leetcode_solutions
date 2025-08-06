class Solution {
    public void func(int[] nums,List<List<Integer>> ans,boolean[] freq,List<Integer> ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i]) continue;
            if(i!=0 && nums[i]==nums[i-1] && !freq[i-1]) continue;
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                func(nums,ans,freq,ds);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }

        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        Arrays.sort(nums);
        func(nums,ans,freq,new ArrayList<>());
        return ans;
        
    }
}