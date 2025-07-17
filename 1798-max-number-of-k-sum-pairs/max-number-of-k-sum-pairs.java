class Solution {
    public int maxOperations(int[] nums, int k) {
        /*Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int cnt = 0;
        while(i<j){
            if(nums[i]+nums[j] < k){
                i++;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else{
                cnt++;
                i++;
                j--;
            }
        }
        return cnt;*/
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        for(int num:nums){
            int comp = k-num;
            if(map.containsKey(comp)&&map.get(comp)>0){
                cnt++;
                map.put(comp , map.get(comp)-1);
            }
            else{
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        return cnt;
        
        
    }
}