class Solution {
    public void func(int[] nums,List<List<Integer>> ans,List<Integer> ds,Map<Integer,Integer> map){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                ds.add(nums[i]);
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                func(nums,ans,ds,map);
                ds.remove(ds.size()-1);
                map.remove(nums[i]);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        func(nums,ans,new ArrayList<>(),map);
        return ans;
        
    }
}