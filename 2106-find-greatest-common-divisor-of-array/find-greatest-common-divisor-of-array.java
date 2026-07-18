class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s = nums[0];
        int l = nums[nums.length-1];
        while(s!=l){
            if(s>l) s=s-l;
            else l=l-s;
        }
        return s;
        
        
    }
}