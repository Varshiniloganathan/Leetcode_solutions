class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;                                     
        int ele = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                ele = nums[i];    
                cnt++;            
                                                    
            }
            else if(nums[i]!=ele){
                cnt--;
            }
            else{
                cnt++;
            }
        }

        int newcnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == ele){
                newcnt++;
            }
        }
        if(newcnt>nums.length/2) return ele;
        return ele;

        
    }
}
