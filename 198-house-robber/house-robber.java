class Solution {
    public int recur(int[] nums, int i,Map<Integer,Integer> map){
        if(map.containsKey(i)) return map.get(i);
        if(i >= nums.length) return 0;
        int ans = Math.max(0+recur(nums,i+1,map),nums[i]+recur(nums,i+2,map));
        map.put(i,ans);
        return map.get(i);
    }
    public int rob(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        return recur(nums, 0, map);
        
    }
}