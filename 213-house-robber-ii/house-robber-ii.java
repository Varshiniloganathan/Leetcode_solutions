class Solution {

    public int recur(int[] nums,int i,int j,Map<String,Integer> map){
        String key = i +""+j;

        if(map.containsKey(key)) return map.get(key);
        if(i>j) return 0;
        int res = Math.max(0+recur(nums,i+1,j,map),nums[i]+recur(nums,i+2,j,map));
        map.put(key,res);
        return map.get(key);
    }
    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];

        HashMap<String,Integer> map = new HashMap<>();

        return Math.max(recur(nums,0,nums.length-2,map),recur(nums,1,nums.length-1,map));


        
    }
}